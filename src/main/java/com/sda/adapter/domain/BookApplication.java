package com.sda.adapter.domain;

import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        BooksService booksService = new BooksService();
        BooksFromTextFileAdapter booksFromTextFileAdapter = new BooksFromTextFileAdapter(
                "/Users/szymon.nowak/sda/javapoz20-zajecia-uzupelniajace/src/main/resources/books/books.txt"
        );

        List<Book> books = booksFromTextFileAdapter.readBooks();
        booksService.showBooks(books);
    }
}
