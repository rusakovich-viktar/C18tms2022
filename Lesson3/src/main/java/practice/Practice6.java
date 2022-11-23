package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        System.out.println("Введите слово, число, число с плавающей точкой и boolean значение");

        Scanner myScanner = new Scanner(System.in);
        int[] ints = new int[myScanner.nextInt()];

        Random random = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));

//        String s = myScanner.nextLine();
//        int i = myScanner.nextInt();
//        double d = myScanner.nextDouble();
//        boolean b = myScanner.nextBoolean();

//        System.out.println(s + ", " + i + ", " + d + ", " + b);
    }
}
