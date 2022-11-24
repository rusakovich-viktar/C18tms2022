package practice3;

public class P2 {
    //обмен значениями без использования временной переменной
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
//        int temp = a;
//        a = b;
//        b = temp;

        a = a + b;//9
        b = a - b;//9-8=1
        a = a - b;//9-1=8

        System.out.println("a " + a);
        System.out.println("b " + b);
    }

}
