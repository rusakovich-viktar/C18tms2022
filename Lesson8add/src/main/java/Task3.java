/*3. Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и
        сообщите, для какого из массивов это значение оказалось больше (либо
        сообщите, что их средние арифметические равны).*/

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double sumArrayOneValue = 0;
        double sumArrayTwoValue = 0;
        Random random = new Random();
        int arraySize = random.nextInt(2, 10);
        int[] ints1 = new int[arraySize];
        int[] ints2 = new int[arraySize];
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = random.nextInt(arraySize);
            sumArrayOneValue += ints1[i];
            ints2[i] = random.nextInt(arraySize);
            sumArrayTwoValue += ints2[i];
        }
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        double averageOne = sumArrayOneValue / ints1.length;
        double averageTwo = sumArrayTwoValue / ints2.length;
        if (averageOne > averageTwo) {
            System.out.printf("Среднее арифметическое значений первого массива равное %.01f больше второго, равного %.01f", averageOne, averageTwo);
        } else if (averageOne < averageTwo) {
            System.out.printf("Среднее арифметическое значений первого массива равное %.01f меньше второго, равного %.01f", averageOne, averageTwo);
        } else {
            System.out.printf("Среднее арифметическое значений массивов равны, значения равны %.01f", averageOne);
        }
    }
}
