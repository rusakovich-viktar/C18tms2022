import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int b1 = 5;
        int b2 = 5;
        int b3 = 5;
        int b4 = 5;
        int b5 = 5;

//        int[] ints = null;
//        ints = new int[10];

//        int[] mass = new int[3];

        int[] ints = new int[10];
        ints[4] = 5;

        Arrays.fill(ints, 3);

        int[] ints1 = new int[]{};
        int[] ints2 = {};
        int[][] ints3 = {
                {1, 23, 5, 4},
                {1, 23, 5, 4},
                {1, 23, 5, 4}
        };


        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println(value);
        }

//        for (int value : ints) {
//            System.out.println(value);
//        }

//        for (int index = 0; index < ints.length; index++) {
//            System.out.println(ints[index]);
//        }

        int[] ints5 = new int[10];


        System.out.println(ints);

//        0, null, false
    }
}