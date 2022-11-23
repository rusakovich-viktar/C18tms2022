package practice3;

public class P1 {
    //Часто в процессе решения той или иной задачи, две переменные должны обменяться значениями.
    public static void main(String[] args) {
        int a = 1;
        int b = 8;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a " + a);
        System.out.println("b " + b);
    }

}
