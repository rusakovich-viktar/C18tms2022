package by.tms.task6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//             * Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
//             * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
@Getter
@Setter
@AllArgsConstructor
public class Reader {
    private String fullName; //ФИО
    private String email;
    private boolean subscriber; //активный подписчик
    private List<Book> books; //список взятых книг записанных в читательском билете

    public Reader(String fullName, String email, boolean subscriber) {
        this.fullName = fullName;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader that = (Reader) o;
        return Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}