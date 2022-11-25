/*1. Создайте массив целых чисел. Удалите все вхождения заданного
        числа из массива.
        Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        выведите сообщения об этом.
        В результате должен быть новый массив без указанного числа.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2})));
    }

    public static int[] removeElement(int[] ints) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска");
        int searchingNumber = scanner.nextInt();
        int offsetCount = 0;
        if (ints != null && ints.length > 0) {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == searchingNumber) {
                    offsetCount++;
                } else {
                    ints[i - offsetCount] = ints[i];
                }
            }
            return Arrays.copyOf(ints, ints.length - offsetCount);
        } else {
            return null;
        }
    }
}