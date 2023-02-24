package by.tms.task4.model;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

enum CategoryType {
    HOME_ELECTRONICS, COMPUTERS
}

//Создать класс Категория, имеющий переменные имя и множество товаров.
//Создать несколько объектов класса Категория.
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Category {

    private CategoryType name;
    private Set<Product> products;
}