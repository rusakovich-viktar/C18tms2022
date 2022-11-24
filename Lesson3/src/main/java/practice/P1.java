package practice;

public class P1 {

    public final static String CHIS = "c://1";//константа
    private String value;

    public static void main(String[] args) {
        System.out.println(CHIS);
        P1 p1 = new P1();
        System.out.println(p1.value);

        //Работа с разными системами счисления целых чисел.

//        1байт = 8бит
//        2байта = 16бит
//        4байта = 32бита
//        8байт = 64бита

        char mySimpleChar = 's';//
        char myChar = '3';
        System.out.println(myChar);

        //0b1101; //2 система(0 или 1)
        int a = 0b1101 + 1; //14
        //1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 8+4+0+1=13
        int b = 012314; //8 система(0 1 2 3 4 5 6 7)
//        1*8^4 + 2*8^3 + 3*8^2 + 1*8^1 + 4*8^0 =
        int c = 456;//10 (0 до 9)
        int d = 0x141D12;//16 система (0 до 9 и A B C D E F)

        calculate(a, b);
//        int result = calculate2(a, b);
//        System.out.println(result);

        //A   B  C  D  E  F
        //10 11 12 13 14 15
//    "\t"
        int result = getCalculateResult();
//        'd'
//        'a'
//        "s"

//        2L
//        3D
//            2F

//        BigDecimal - для точных вычислений

        String s = "";

//        BigDecimal decimal = new BigDecimal(2.3);
//        decimal.add(BigDecimal.valueOf(1));

        String str = "adsdasdsa \"privet\"";
        str = String.valueOf(4);

        System.out.println(str);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(result);

        boolean b1 = true;//1
        boolean b2 = false;//0
        Boolean mm = null;
        Boolean mm1 = true;
        Boolean mm3 = false;


//byte        -128 ... 127
//

//        long mm = null;

        long cc = 0;
        float f = (float) 3.4D;
        double fff = 4.5;
        Long nn = 41111111L;

        char e = (int) 'e';

        String cHIS = "";// не правильное
        String CHIs = "";//не правильное

        int bbbb = e;

        int i = 'e' + 5;//106

        System.out.println(bbbb);//e

        System.out.println(d == result);
    }

    private static int calculate2(int a, int b) {
        return a + b;
    }

    private static void calculate(int a, int value) {
        System.out.println(a + value);
        System.out.println(a + value);
        System.out.println(a + value);
        System.out.println(a + value);
    }

    public void _10Summ(int a, int b, int c) {

    }

    private static int getCalculateResult() {
        return (int) (1 * Math.pow(16, 5) + 4 * Math.pow(16, 4) + 1 * Math.pow(16, 3)
                + 13 * Math.pow(16, 2) + 1 * Math.pow(16, 1) + 2 * Math.pow(16, 0));
    }

}
