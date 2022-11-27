/*
11. Создайте двумерный массив. Выведите на консоль диагонали массива.
*/

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        printArrayWithPrintDiagonale();

    }

    public static void printArrayWithPrintDiagonale() {
        int[][] mass = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(10);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        printDiagonales(mass);
    }

    public static void printDiagonales(int[][] mass) {

        System.out.println();
        System.out.println("Главная диагональ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i][i] + " ");
        }
        System.out.println("Побочная диагональ");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i][mass.length - 1 - i] + " ");
        }
    }
}