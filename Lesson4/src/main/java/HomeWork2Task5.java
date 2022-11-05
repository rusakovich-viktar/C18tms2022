/**
 * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
 * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
 * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
 * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
 */

public class HomeWork2Task5 {
    public static void main(String[] args) {
        foobar(6);
        foobar(10);
        foobar(15);
    }

    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }
}