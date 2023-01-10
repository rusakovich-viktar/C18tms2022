package by.tms.task1.model;

import java.util.Arrays;
import java.util.List;

//  1)Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//          Избавиться от повторяющихся элементов в строке и вывести результат на экран.
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 5);
        System.out.println(integers.stream()
                .distinct()
                .toList());


    }


}
