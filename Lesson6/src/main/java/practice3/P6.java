package practice3;

import java.util.Arrays;

public class P6 {
    //поиск
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 9};
        Arrays.sort(array);

        //линейный поиск
        System.out.println("индекс элемента в массиве " + lineSearch(array, 5));

        //возвращает индекс элемента в массиве
        Arrays.sort(array);
        System.out.println("индекс элемента в массиве " + Arrays.binarySearch(array, 2));
        System.out.println("индекс элемента в массиве " + binarySearch(array, 2));

        //поиск прыжками
        System.out.println("индекс элемента в массиве " + jumpSearch(array, 4));
    }

    private static int lineSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }

}
