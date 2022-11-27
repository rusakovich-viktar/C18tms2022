/*12. Создайте двумерный массив целых чисел. Отсортируйте элементы в
        строках двумерного массива по возрастанию.*/

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Неотсортированный массив\n" + Arrays.deepToString(ints));

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                Arrays.sort(ints[i]);
            }
        }
        System.out.println("\nОтсортированный массив\n" + Arrays.deepToString(ints));
    }
}