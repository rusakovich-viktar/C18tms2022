package by.tms.model;

import java.util.ArrayList;
import java.util.List;

//     * Все задачи необходимо решать используя Stream API и выводить результат на консоль !!!
//             * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(40);
        list.add(100);

        list.stream()
                .map(i -> i * 2).forEach(System.out::println);
    }
}