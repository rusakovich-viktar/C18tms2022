package by.tms.model.task6.model;
//Library содержит список книг и список читателей.

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Library {
    private List<Book> listBooksInLibrary;
    private List<Reader> listReaderInLibrary;

}
