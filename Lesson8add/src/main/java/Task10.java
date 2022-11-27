/*10. Создайте двумерный массив целых чисел. Выведите на консоль сумму
        всех элементов массива.*/

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(20);
                sum += ints[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ints));
        System.out.printf("Сумма элементов массива равна %d", sum);
    }
}