package com.example.booknoteserver.repository;

import com.example.booknoteserver.model.BookNote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookNote, String> {


    BookNote findByuId(String uId);
}
