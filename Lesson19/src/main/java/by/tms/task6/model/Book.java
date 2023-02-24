package by.tms.task6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

//             * Для каждой книги библиотечного фонда известны автор, название и год издания.
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {

    private String author;
    private String title;
    private int yearOfPublishing; //год издания

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfPublishing);
    }
}
