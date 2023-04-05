package com.example.booknoteserver.service;

import com.example.booknoteserver.model.BookInfo;
import com.example.booknoteserver.model.BookNote;
import com.example.booknoteserver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookNoteService {
    @Autowired
    private BookRepository repository;
    //Crud CREATE, READ, UPDATE, DELETE

    public BookNote addBook(BookNote bookNote) {
        return repository.save(bookNote);
    }
    public BookNote findUId(String uId) {
        return repository.findByuId(uId);
    }

    public List<BookNote> findAllBookNote() {
        return repository.findAll();
    }

//    public BookNote getBookNoteByTitle(BookInfo bookInfo) {
//        return (BookNote) repository.findByTitle(bookInfo.getTitle());
//    }
//
//    public List<BookNote> findByUId(String uId){
//        return  repository.findByuId(uId);
//    }

//    public BookNote updateBook(BookNote bookNote) {
//        BookNote existingBookNote = repository.findByuId(bookNote.getuId()).get();
//    }
}
