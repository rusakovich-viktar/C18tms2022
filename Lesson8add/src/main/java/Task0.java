import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    /* 0. Создайте массив целых чисел. Напишете программу, которая выводит
  сообщение о том, входит ли заданное число в массив или нет.
  Пусть число для поиска задается с консоли (класс Scanner).*/

    public static void main(String[] args) {
        enterNumberAndCheckIncludeNumbersInArray(10, 15);
    }

    private static void enterNumberAndCheckIncludeNumbersInArray(int countElementsInArray, int maxValueInArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска");
        int searchingNumber = scanner.nextInt();
        Random random = new Random();
        int[] ints = new int[countElementsInArray];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(maxValueInArray + 1);
        }
        boolean checkIncludeNumberInArray = checkIncludeNumberInArray(searchingNumber, ints);
        System.out.print("В массив " + Arrays.toString(ints));
        System.out.println(checkIncludeNumberInArray ? " число " + searchingNumber + " входит" : " число " + searchingNumber + " не входит");
    }

    private static boolean checkIncludeNumberInArray(int searchingNumber, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == searchingNumber) {
                return true;
            }
        }
        return false;
    }

}





