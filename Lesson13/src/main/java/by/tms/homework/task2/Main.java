package by.tms.homework.task2;

//     * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
public class Main {
    public static void main(String[] args) {

        String text = "Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 04";

        if (!text.isEmpty() && text.length() > 3) {
            System.out.println(text.replace(text.charAt(3), text.charAt(0)));
        } else {
            System.out.println("Попробуйте ввести текст побольше");
        }
    }
}