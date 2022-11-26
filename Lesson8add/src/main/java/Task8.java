//8. Создать трехмерный массив из целых чисел.
//        С помощью циклов "пройти" по всему массиву и увеличить каждый
//        элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] ints = {{{1, 2, 3}, {4, 5, 6}}, {{1, 2, 3, 4}, {5, 6}, {7}}, {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}};

        System.out.println("Введите число, на которое вы хотите увеличить все значения трехмерного массива:");
        System.out.println(Arrays.deepToString(ints));
        int increasingNumber = scanner.nextInt();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                for (int k = 0; k < ints[i][j].length; k++) {
                    ints[i][j][k] = ints[i][j][k] + increasingNumber;
                }
            }
        }
        System.out.println(Arrays.deepToString(ints));
    }
}