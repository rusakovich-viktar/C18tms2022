package practice_hw.tms.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice12 {
    public static void main(String[] args) {
        //1)заполнение массива рандомными числами от 0 до 9
        byte[] array = new byte[50];
        Random random = new Random();
        random.nextBytes(array);
        System.out.println(Arrays.toString(array));
        System.out.println("_____________");

        //2)
        int[] array1 = new int[50];
        Arrays.setAll(array1, x -> random.nextInt(21) - 10);
//        random.nextInt(21) 0 1 2....20; 5 -10 = -5 [-10, 10]
        System.out.println(Arrays.toString(array1));
        System.out.println("_____________");

        //3)
        int[] massiv = new int[100];
        Arrays.setAll(massiv, operand -> (int) (Math.random() * 11));
        System.out.println(Arrays.toString(massiv));
        System.out.println("_____________");

    }
}
