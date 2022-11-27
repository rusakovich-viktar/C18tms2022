package practice_hw.tms.home_work;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
        checkRepeat(new int[]{3, 2, 46, 3, 2, 1, 2});
//        System.out.println();
//        checkRepeat(new int[]{1, 1, 1, 1, 1, 1, 1});
//        System.out.println();
//        checkRepeat(new int[]{1, 1, 1, 4, 5, 5,});
//        System.out.println();
//        checkRepeat2(new int[]{3, 2, 46, 3, 2, 1, 2});
//        System.out.println();
//        checkRepeat2(new int[]{1, 1, 1, 1, 1, 1, 1});
//        System.out.println();
//        checkRepeat2(new int[]{1, 1, 1, 4, 5, 5, 5});
    }


    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0, 0, 34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void checkRepeat2(int[] mass) {
        if (mass != null && mass.length > 2) {
            String[] arrayRepeatedElements = new String[mass.length];//3 2 null
            int indexRepeated = 0;
            for (int i = 0; i < mass.length; i++) {
                for (int j = i + 1; j < mass.length; j++) {
                    if (mass[i] == mass[j] && !checkDuplicateElement(mass[i], arrayRepeatedElements)) {
                        arrayRepeatedElements[indexRepeated] = mass[i] + "";
                        indexRepeated++;
                        break;
                    }
                }
            }
            if (arrayRepeatedElements[0] != null) {
                System.out.print("Массив имеет повторяющиеся элементы ");
                for (String element : arrayRepeatedElements) {
                    if (element != null) {
                        System.out.print(element + ", ");
                    } else {
                        break;
                    }
                }
                System.out.print("\b\b");
            } else {
                System.out.print("Массив не имеет повторяющихся элементов");
            }
        }
    }

    private static boolean checkDuplicateElement(int value, String[] array) {
        for (String element : array) {
            if (element != null && element.equals(String.valueOf(value))) {
                return true;
            }
        }
        return false;
    }


    public static void checkRepeat(int[] mass) {
        if (mass != null && mass.length > 2) {
            Arrays.sort(mass); //1 1 1 1 3 3 3 5 6
            boolean isRepeated = false;
            for (int i = 0, j = i + 1; j < mass.length; j++, i++) {
                if (mass[i] == mass[j]) {
                    if (!isRepeated) {
                        System.out.print(mass[i] + " ");
                        isRepeated = true;
                    }
                } else {
                    isRepeated = false;
                }
            }
        }
    }
}
