
/**
 * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
 * - if number положительное число, то необходимо number увеличить на 1
 * - if number отрицательное - уменьшить на 2
 * - if number равно 0 , то замените значение number на 10
 * вернуть number после выполнения операций
 */
public class HomeWork2Task2 {

    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(operation(-1));
    }

    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }
}