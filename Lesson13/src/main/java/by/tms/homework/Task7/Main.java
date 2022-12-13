package by.tms.homework.Task7;
//7*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
//        * "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"

public class Main {
    public static void main(String[] args) {
        String text = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — " +
                "геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";

        String[] simpleWords = text.split(" ");
        int count = 0;
        for (String simpleWord : simpleWords) {
            if (simpleWord.matches("(^[a-zA-Z]++$)")) { //++ сверхжадный квантификатор
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
https://habr.com/ru/post/260773/
https://www.regextester.com/
https://regex101.com/
https://proglib.io/p/regex*/