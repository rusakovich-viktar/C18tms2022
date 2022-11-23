package practice;

public class Practice5 {

    String str;//null
    int value;

    public static void main(String[] args) {

//        1   2 34
//        34 45 56
//        12  4  6

        boolean b[] = new boolean[3];
        b[0] = true;
        b[1] = true;
        b[2] = false;

        int[] kk = {};
        System.out.println(kk.length);

        String str = null;
        int[] mass1 = null;

        int[] nn = new int[5];

        int[] mass = new int[5];
        //0 - 0 индекс
        //0 - 1 индекс
        mass[2] = 10;//- 2 индекс
        //0 - 3 индекс
        mass[4] = 11; //- 4 индекс

        System.out.println();

        int length = mass.length;//
        int element = mass[--length];//mass[4] //
        System.out.println(element);
        System.out.println(mass[--length]);//
    }
}
