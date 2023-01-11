package by.tms.task4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String name;
    private int price;
    private int rate;


}
