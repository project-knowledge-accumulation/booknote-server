package com.example.booknoteserver.controller;

import com.example.booknoteserver.model.BookNote;
import com.example.booknoteserver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookNoteResolver {

    @Autowired
    private BookRepository bookRepository;

    public BookNote getBookNoteByUid(String uId) {
        System.out.println("🍓" + uId);
        return bookRepository.findByuId(uId);
    }
}