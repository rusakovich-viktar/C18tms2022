package by.tms.homework.task2;

//     * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
public class Main {
    public static void main(String[] args) {
        replaceValue3to4("Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 04");
    }

    public static void replaceValue3to4(String inputString) {
        if (inputString.length() > 3) {
            System.out.println(inputString.replace(inputString.charAt(3), inputString.charAt(0)));
        } else {
            System.out.println("Попробуйте ввести текст побольше");
        }
    }
}