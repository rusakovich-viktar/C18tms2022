package practice_hw.tms.home_work;

import java.util.Random;

public class AdditionalTask {
    //    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.

    public static void main(String[] args) {
        summThreeNummbers();
    }

    private static void summThreeNummbers() {
        Random random = new Random();
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(1000);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        int indexMaxI = 0;
        int indexMaxJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i][j + 2];
                if (max < sum) {
                    max = sum;
                    indexMaxJ = j;
                    indexMaxI = i;
                }
            }
            System.out.println(max + " (" + indexMaxI + ", " + indexMaxJ + ")");
            max = 0;
        }
    }

}
