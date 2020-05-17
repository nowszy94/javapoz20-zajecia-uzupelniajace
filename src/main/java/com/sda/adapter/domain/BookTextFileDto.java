package com.sda.adapter.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Random;

@Data
@Builder
public class BookTextFileDto {
    private String name;
    private String author;
    private String ISBN;
    private String description;
    private Integer year;
    private Integer month;
    private Integer day;

    public static BookTextFileDto fromDomain(Book book) {
        // domain -> dto
        return null;
    }

    public Book toDomain() {
        // dto -> domain
        return Book.builder()
                .id(new Random().nextLong())
                .name(this.name)
                .ISBN(this.ISBN)
                .releaseDate(LocalDate.of(year, month, day).atStartOfDay().toInstant(ZoneOffset.UTC))
                .build();
    }
}
