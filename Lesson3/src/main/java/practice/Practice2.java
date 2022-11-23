package practice;

public class Practice2 {

    public static void main(String[] args) {

        double a = 6.0;
        int m = 3;
//        int b = 5;

//        b += m;
//        b = b + m;

//        System.out.println(a % m);//0.0

//        int b = 0b10101010;
//        int b1 = 170;
//        int b2 = 170;
//        int i = b1 & b2;

        byte a5 = 12;

//        1010 0000
//        System.out.println((byte) 0b11111111);

        System.out.println(0b10100000);
        System.out.println(0b10100000 << 2);//1010000000
        System.out.println(160 << 2);
        System.out.println(160 >> 2);
//        0b1010000000
//        0b10100

        System.out.println(~a5);

        System.out.println(~0b1100);

        //000 1100
//        System.out.println(0b111110011);


        boolean b = true;
        boolean k = true;
        boolean b2 = b || k;//true
//        b = k;//true

        if (5 <= 5) {//false||true
            System.out.println("da");
        } else {
            System.out.println("net");
        }


        if (b != k) {//true
            //
            System.out.println("!!!!");
        }
        System.out.println(b);//true

        //false - true
        //true - false

        k = !b;

        int t = 2;
        int t2 = 5;
        int i = t | t2;


        int mm = 8;
        System.out.println(mm);//8
        mm = -2; // -2
        System.out.println(mm);//6, -2
        mm += 2;
        System.out.println(mm);//8, 0

        int a1 = 4;//100
        int b1 = 5;//101
        //000
        System.out.println(a1 | b1);//101

        //111
//        1*2^2+1*2^1+1*2^0=4+2+1


        System.out.println("-----------");

        System.out.println(true || false);//true
        System.out.println(false && true);//false
        System.out.println(true ^ false); //XOR логическое исключающее ИЛИ // true
        System.out.println(true && !false);// true

        if (!b) {

        }

        if (5 > 3 && 7 < 2) {
            ///операция
        }

        System.out.println(1 & ~0);//~ (логическое отрицание) & (логическое умножение)//true

        System.out.println(more(3, 5) && less(7, 10));//
        System.out.println(more(5, 3) & less(10, 7));//1 & 0 = 0

        System.out.println(more(5, 3) | less(7, 10));//
        System.out.println(more(5, 3) || less(7, 10));//
        System.out.println(14.5 % 3);//
    }

    private static boolean more(int a, int b) {
        System.out.print("a more b ");
        return a > b;
    }

    private static boolean less(int a, int b) {
        System.out.print("a less b ");
        return a < b;
    }
}
