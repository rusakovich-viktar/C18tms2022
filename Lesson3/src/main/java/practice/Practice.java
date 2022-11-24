package practice;

public class Practice {//начало класса

    public static void main(String[] args) { //начинается работа майн
//        тут только вызваем методы или пишем логику
        calculation(); //вызов метод расчета а+b и вывода на консоль
        next();
    } //после этой скобки заканчивается работа метода майн

    //тут пишем уже метод calculation
    public static void calculation() { //начало метода
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        if (b > a) {
            String ss = next();
            System.out.println(ss);
        }
    } //после этой скобки заканчивается работа метода calculation

    //следующий метод next (нигде не вызвается). например можем вызвать в методе calculation(). Попробуйте.
    public static String next() {
        return "next";
    }
}//конец класса
