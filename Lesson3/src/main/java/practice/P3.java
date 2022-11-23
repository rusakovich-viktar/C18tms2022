package practice;

public class P3 {
    public static void main(String[] args) {
        //Арифметические операции
        //++ (инкремент) и -- (декремент)
        //a + b


        int count = 0;
        count = count + 1;

        ++count;
        System.out.println(count);
        count++;
        System.out.println(count);

        System.out.println(count);//3
        System.out.println("!!");
        int bb = 1;
        System.out.println(bb);//1
        System.out.println(++bb);//2
        System.out.println(bb++);//2
        System.out.println(bb);//3

        int counter = 0;

//        counter = counter + 1;
        counter++;

        --counter;

        int b = 12;
        int kk = 1 + ++b;
        System.out.println(kk);//14
        System.out.println(b);//13

        //BigDecimal
        double ll = 7;
        System.out.println(ll / 4);//1.75
        System.out.println(17 % 4);//17-4*4=1

    }
}
