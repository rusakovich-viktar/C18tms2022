package task2.by.tms.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static task2.by.tms.service.HeavyBoxCreator.creator;

//2) Создать коллекцию, содержащую объекты HeavyBox.
//        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//        Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

public class Main {
    public static void main(String[] args) {
        //Создать коллекцию, содержащую объекты HeavyBox.
        List<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes = Arrays.<HeavyBox>asList(
                creator("BoxOne", 3000),
                creator("BoxTwo", 200),
                creator("BoxThree", 1000),
                creator("BoxFour", 10000),
                creator("BoxFive", 20),
                creator("BoxSix", 500),
                creator("BoxSeven", -300));

        heavyBoxes.forEach(System.out::println);

        System.out.println("");
        //        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//        Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
        List<HeavyBox> otherBoxes = heavyBoxes.stream()
                .filter(heavyBox -> heavyBox.getWeight() > 300)
                .toList();

        otherBoxes.forEach(System.out::println);

    }
}