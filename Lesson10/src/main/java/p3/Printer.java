package p3;

public class Printer {

    //    @FunctionalInterface
    public interface Printable {
        void print();

        default void info() {
            System.out.println("info");
            System.out.println("info");
            method();
        }

        private String method() {
            System.out.println("info");
            System.out.println("info");
            System.out.println("info");
            return "";
        }

        static void max() {
            System.out.println("static");
        }
    }
}
