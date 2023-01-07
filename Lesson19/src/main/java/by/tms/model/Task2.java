package by.tms.model;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

//* 2) Определение количества четных чисел в потоке данных.
//        * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
public class Task2 {
    public static void main(String[] args) {

        Set<Integer> randomSet = getRandomSet(50);
        randomSet.forEach(System.out::println);
    }

    private static Set<Integer> getRandomSet(int count) {
        return new Random()
                .ints(0, 101)
                .distinct()
                .limit(count)
                .boxed()
                .collect(Collectors.toSet());
    }
}