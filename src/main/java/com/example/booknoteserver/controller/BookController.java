//package com.example.booknoteserver.controller;
//
//import com.example.booknoteserver.model.BookNote;
//import com.example.booknoteserver.repository.BookRepository;
//import org.springframework.stereotype.Controller;
//
//import java.util.List;
//
//@Controller
//public class BookController {
//    private final BookRepository bookRepository;
//
//    public BookController(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//    public List<BookNote> getAllBooks() {
//        return bookRepository.findAll();
//    }
//
//    public BookNote getBookById(String id) {
//        return bookRepository.findById(id).orElse(null);
//    }
//}
