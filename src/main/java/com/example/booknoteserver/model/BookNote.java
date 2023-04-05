package com.example.booknoteserver.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Setter
@Document(collection = "booknote")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookNote {
    @Id
    private String id;
    private String name;
    private String uId;
    private ArrayList<BookInfo> bookInfo;
    public BookNote(String name, String uId, ArrayList<BookInfo> bookInfo) {
        this.name = name;
        this.uId = uId;
        this.bookInfo = bookInfo;
    }

    public String getuId() {
        return uId;
    }

    @Override
    public String toString() {
        return "BookNote{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", uId='" + uId + '\'' +
                ", bookInfo=" + bookInfo +
                '}';
    }
}


