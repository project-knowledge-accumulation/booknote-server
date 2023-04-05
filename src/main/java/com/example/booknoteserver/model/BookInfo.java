package com.example.booknoteserver.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Getter
@Setter
@Document(collection = "bookinfo")
@Data
@NoArgsConstructor
public class BookInfo {
    private String title;
    private ArrayList<Notes> noteCollection;

    public BookInfo(String title, ArrayList<Notes> noteCollection) {
        this.title = title;
        this.noteCollection = noteCollection;
    }

    public String printBookInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book Title: ").append(this.title).append("\n");
        sb.append("Notes:\n");
        for (Notes note : this.noteCollection) {
            sb.append("- Page ").append(note.getPage()).append(": ").append(note.getNote()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "title='" + title + '\'' +
                ", noteCollection=" + noteCollection +
                '}';
    }
}
