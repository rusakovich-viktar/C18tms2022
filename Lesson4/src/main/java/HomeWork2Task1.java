import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Необходимо прочитать с консоли значение числа типа int,
 * сделать проверку что если пользователь ввел не положительное число,
 * то вывести ошибку и отправить пользователя вводить заново новое число!
 * далее создать одномерный массив типа int размера прочитанного с консоли
 * далее заполнить массив случайными значениями
 * далее вывести массив на консоль
 */

public class HomeWork2Task1 {
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        System.out.println("Введите положительное число");
        do {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Ошибка, введите число заново");
            }
            scanner.next();
        } while (value <= 0);

        int[] array = new int[value];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        printArray();
    }
}