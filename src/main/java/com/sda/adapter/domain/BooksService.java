package com.sda.adapter.domain;

import java.util.List;

public class BooksService {

    public void showBooks(List<Book> books) {
        books.forEach(book -> System.out.println(book));
    }
}
