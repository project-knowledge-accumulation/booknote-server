package com.example.booknoteserver.controller;

import com.example.booknoteserver.model.BookInfo;
import com.example.booknoteserver.model.BookNote;
import com.example.booknoteserver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/home")
@CrossOrigin(origins = "*")
public class BookNoteController{

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/{uId}")
    public ResponseEntity<BookNote>getBookInfo(@PathVariable String uId) {
        System.out.println("🍓" + uId);
        Optional<BookNote> bookNote = Optional.ofNullable(bookRepository.findByuId(uId));
        return bookNote.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //this should be modified so that when a user is new, it gives an empty template object!.
    @PostMapping(value = "/create-book")
    public ResponseEntity<BookNote> postNote(@RequestBody BookNote bookNote) {
        try {
            String name = bookNote.getName();
            String uId = bookNote.getuId();
            ArrayList<BookInfo> bookInfo = bookNote.getBookInfo();
            BookNote newBookObj = new BookNote(name, uId, bookInfo);
            bookRepository.save(newBookObj);
            return ResponseEntity.status(HttpStatus.CREATED).body(newBookObj);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<BookNote> updateBookInfo(@PathVariable String id, @RequestBody BookNote updatedBookNote) {
        System.out.println("🍎"+ id);
        BookNote existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User with id" + id + " not found"));
        existingBook.setBookInfo(updatedBookNote.getBookInfo());

        BookNote savedBookNote = bookRepository.save(existingBook);

        return ResponseEntity.ok(savedBookNote);
    }
}
