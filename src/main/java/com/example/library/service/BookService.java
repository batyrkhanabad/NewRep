package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




}
