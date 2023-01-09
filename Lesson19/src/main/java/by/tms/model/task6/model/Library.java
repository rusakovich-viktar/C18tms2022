package by.tms.model.task6.model;
//Library содержит список книг и список читателей.

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Library {

    //    List<Book> booksInLibrary = Arrays.asList(
//            new Book("Лев Толстой", "Смерть Ивана Ильича", 1886),
//            new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 1886),
//            new Book("Чарлз Диккенс", "Повесть о двух городах", 1859),
//            new Book("Чарлз Диккенс", "Оливер Твист", 1839),
//            new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901),
//            new Book("Антон Павлович Чехов", "Попрыгунья", 1891),
//            new Book("Виктор Гюго", "Человек, который смеётся", 1860),
//            new Book("Виктор Гюго", "Собор Парижской Богоматери", 1831),
//            new Book("Виктор Гюго", "Отверженные", 1862),
//            new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940),
//            new Book("Эрнест Хемингуэй", "Снега Килиманджаро", 1936),
//            new Book("Александр Сергеевич Пушкин", "Руслан и Людмила", 1820),
//            new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833),
//            new Book("Александр Сергеевич Пушкин", "Борис Годунов", 1825));
    private List<Book> booksInLibrary;
    private List<Reader> readersInLibrary;
}
