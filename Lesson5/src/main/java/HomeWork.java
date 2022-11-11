import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        getDayOfTheWeek(); //1
//        countOfUnicellularAmoebas(); //2
//        determinePositiveNegativeAndPrintNumberOfDigits();  //3
//////        calculateSumOfDiagonalElements();
//////        printMatrix();
//        reverseArrayOfOddElements(100); //7
//        findMaxRandomValueInArray(); //8
        replaseAllArrayOddIndexToZero();//9
//        arrayFindMaxAndReplace(); //10
    }


    /*        Задачи:
    1) Задача на оператор switch!
            Рандомно генерируется число От 1 до 7.
            Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
            Если 6 или 7 – “Выходной”.*/
    private static void getDayOfTheWeek() {
        Random random = new Random();
        int randomValue = random.nextInt(1, 8);
        String daysOfWeek = switch (randomValue) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6, 7 -> "Выходной";
            default -> throw new IllegalStateException("Unexpected value: " + randomValue);
        };
        System.out.println(daysOfWeek);
    }


    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    private static void countOfUnicellularAmoebas() {
        int countAmoebas = 1;
        for (int i = 3; i <= 24; i += 3) {
            countAmoebas *= 2;
            System.out.println("Количество часов с начала " + i + ", а количество амеб " + countAmoebas);
        }
    }

    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    private static void determinePositiveNegativeAndPrintNumberOfDigits() {
        System.out.println("Узнаем сколько в введенном числе цифр и положительное оно или отрицательное");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        int length = String.valueOf(input).length();
        if (input > 0) {
            System.out.printf("%d - это положительное число, количество цифр = %d", input, length);
        } else if (input < 0) {
            length -= 1;
            System.out.printf("%d - это отрицательное число, количество цифр = %d", input, length);
        } else {
            System.out.printf("%d - это ноль (ни положительное ни отрицательное), количество цифр = %d", input, length);
        }
    }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.


//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

//        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * * и
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    private static void reverseArrayOfOddElements(int lastValue) {
        int arrayLength = 0;
        for (int i = 1; i <= lastValue; i++) {
            if (i % 2 != 0) {
                arrayLength++;
            }
        }
        int[] array = new int[arrayLength];
        for (int i = 0, j = 1; j <= lastValue; i++, j += 2) {
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            String reverse = array[i] + " ";
            System.out.print(reverse);
        }
    }

    //        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    private static void findMaxRandomValueInArray() {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 16);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.printf("Максимальный элемент %d, индекс его последнего вхождения %d", max, maxIndex);
    }

    //        9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    private static void replaseAllArrayOddIndexToZero() {
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

    //        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    private static void arrayFindMaxAndReplace() {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        int temp = array[maxIndex];
        array[maxIndex] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }

//        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7


    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
    }

//    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.
}