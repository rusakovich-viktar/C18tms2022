package by.tms.model.task6.model;
//Library содержит список книг и список читателей.

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public void init() {
        books = new ArrayList<>();
        books.add(new Book("Лев Толстой", "Смерть Ивана Ильича", 1886));
        books.add(new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 1886));
        books.add(new Book("Чарлз Диккенс", "Повесть о двух городах", 1859));
        books.add(new Book("Чарлз Диккенс", "Оливер Твист", 1839));
        books.add(new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901));
        books.add(new Book("Антон Павлович Чехов", "Попрыгунья", 1891));
        books.add(new Book("Виктор Гюго", "Человек, который смеётся", 1860));
        books.add(new Book("Виктор Гюго", "Собор Парижской Богоматери", 1831));
        books.add(new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940));
        books.add(new Book("Эрнест Хемингуэй", "Снега Килиманджаро", 1936));
        books.add(new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833));

        readers = Arrays.asList
                (new Reader("Русакович Виктор Геннадьевич", "vitek.rus@mail.ru", true),
                        new Reader("Иванов Иван Иванович", "ivan.ivanovich_@gmail.ru", false),
                        new Reader("Юревич Виктор Иванович", "yy@mail-energo.by", true),
                        new Reader("Корбут Павел Джавович", "qwerty@java.com", true),
                        new Reader("Пятый Геннадий Подписович", "qwerdsa@email.net", true));
    }
}