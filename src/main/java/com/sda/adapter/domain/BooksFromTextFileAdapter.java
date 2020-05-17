package com.sda.adapter.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromTextFileAdapter {

    private String path;

    public BooksFromTextFileAdapter(String path) {
        this.path = path;
    }

    public List<Book> readBooks() {
        // 1. plik -> list<dto>
        List<BookTextFileDto> bookTextFileDtos = readFromFile();

        // 2. dto -> domain
        List<Book> books = mapDtosToDomain(bookTextFileDtos);

        // 3. return
        return books;
    }

    private List<Book> mapDtosToDomain(List<BookTextFileDto> bookTextFileDtos) {
        return bookTextFileDtos.stream()
                .map(dto -> dto.toDomain())
                .collect(Collectors.toList());
    }

    private List<BookTextFileDto> readFromFile() {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            List<BookTextFileDto> dtos = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String lineFromFile = scanner.nextLine();
                BookTextFileDto bookTextFileDto = readFromString(lineFromFile);
                dtos.add(bookTextFileDto);
            }

            return dtos;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private BookTextFileDto readFromString(String line) {
        String[] values = line.split(";");

        return BookTextFileDto.builder()
                .name(values[0])
                .author(values[1])
                .ISBN(values[2])
                .description(values[3])
                .year(Integer.parseInt(values[4]))
                .month(Integer.parseInt(values[5]))
                .day(Integer.parseInt(values[6]))
                .build();
    }
}
