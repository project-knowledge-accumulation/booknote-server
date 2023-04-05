package com.example.booknoteserver.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "notes")
@Data
@NoArgsConstructor
public class Notes {
    private int page;
    private String note;

    public Notes(int page, String note) {
        this.page = page;
        this.note = note;
    }
}
