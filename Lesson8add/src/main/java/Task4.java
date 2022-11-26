/*4. Создайте массив из n случайных целых чисел и выведите его на экран.
        Размер массива пусть задается с консоли и размер массива может быть
        больше 5 и меньше или равно 10.
        Если n не удовлетворяет условию - выведите сообщение об этом.
        Если пользователь ввёл не подходящее число, то программа должна
        просить пользователя повторить ввод.
        Создайте второй массив только из чётных элементов первого массива,
        если они там есть, и вывести его на экран.
        4 5 6 7 8 9 10 11
        */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        createArrayCheckEvenAndCreateNewArrayWithEvenValue();
    }

    private static void createArrayCheckEvenAndCreateNewArrayWithEvenValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива n");
        int arraySize = 0;

        do {
            System.out.println("от 6 до 10 включительно");
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
            } else {
                System.out.println("ошибка, n не удовлетворяет условию");
                scanner.next();
            }
        } while (arraySize < 6 || arraySize > 10);
        int[] ints = new int[arraySize];
        fillArrayRandomValueAndCheckCountEvenNum(ints);
    }

    private static void fillArrayRandomValueAndCheckCountEvenNum(int[] ints) {
        Random random = new Random();
        int evenNum = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101);
            if (ints[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println(Arrays.toString(ints));
        createNewArrayWithEvenNum(ints, evenNum);
    }

    private static void createNewArrayWithEvenNum(int[] ints, int evenNum) {
        int[] ints1 = new int[evenNum];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints1[index] = ints[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(ints1));
    }
}