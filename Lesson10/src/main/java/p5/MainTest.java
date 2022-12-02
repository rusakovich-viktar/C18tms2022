package p5;

import p3.Printer;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(Test.MALE);
        System.out.println(Test.FEMALE);

        Printer.Printable test = Test.FEMALE;
        test.print();

    }
}
