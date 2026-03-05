package com.example.employee_api.book.service;

import com.example.employee_api.book.dto.BookRequest;
import com.example.employee_api.book.model.Book;

import java.util.List;

public interface BookService {

    Book createBook(BookRequest request);

    List<Book> getAllBooks();

    Book getBookById(Long id);
}
