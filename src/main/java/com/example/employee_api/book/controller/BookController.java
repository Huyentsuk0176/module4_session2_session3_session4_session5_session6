package com.example.employee_api.book.controller;
import com.example.employee_api.book.dto.BookRequest;
import com.example.employee_api.book.model.Book;
import com.example.employee_api.book.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody BookRequest request){
        return bookService.createBook(request);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }
}