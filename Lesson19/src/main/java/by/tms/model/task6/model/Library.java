package by.tms.model.task6.model;
//Library содержит список книг и список читателей.

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (readers == null) {
            readers = new ArrayList<>();
        }
        return readers;
    }
}