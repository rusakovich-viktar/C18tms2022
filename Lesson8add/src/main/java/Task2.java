/*2. Создайте и заполните массив случайным числами и выведете
        максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        arrayValueMaxMinAverage();
    }

    private static void arrayValueMaxMinAverage() {
        int maxValue;
        int minValue;
        double averageValue;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] ints = new int[scanner.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10);
            sum += ints[i];
        }
        System.out.print("Случайный массив: ");
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.print("Сортированный массив: ");
        System.out.println(Arrays.toString(ints));
        maxValue = ints[ints.length - 1];
        minValue = ints[0];
        averageValue = sum / ints.length;
        System.out.printf("Максимальное значение = %d, минимальное значение = %d, среднее значение =%.01f", maxValue, minValue, averageValue);
    }
}
