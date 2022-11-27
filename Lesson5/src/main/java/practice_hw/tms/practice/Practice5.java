package practice_hw.tms.practice;

public class Practice5 {

    public static void main(String[] args) {
        int[] mass = new int[5];
        mass[2] = 10;
        mass[4] = 11;

        //0 0 10 0 11
        //0 1 2  3  4//индексы
//        System.out.println(mass[5]);

        int length = mass.length;//5
        System.out.println(length);//5
        int element = mass[--length];//mass[4]//11

        System.out.println(length);//4
        System.out.println(element);//11

        System.out.println(mass[--length]);//mass[3]//0
    }
}
