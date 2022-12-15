package by.tms.homework.task5;

import org.apache.commons.lang3.StringUtils;

//* 5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//        * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
public class Main {
    public static void main(String[] args) {
        String text = "ТерморектальныйКриптоанализатор";
        if (StringUtils.isNotBlank(text)) {
            System.out.println(text.substring(text.length() / 2 - 1, text.length() / 2 + 1));
        } else {
            System.out.println("Попробуйте ввести текст побольше");
        }
    }
}