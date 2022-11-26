//5. Создайте массив и заполните массив.
//        Выведите массив на экран в строку.
//        Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

// задача 9 lesson 5

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        replaceAllArrayOddIndexToZero();
    }

    private static void replaceAllArrayOddIndexToZero() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 21);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}