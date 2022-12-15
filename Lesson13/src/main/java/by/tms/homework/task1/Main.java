package by.tms.homework.task1;

//1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
public class Main {
    public static void main(String[] args) {

        String text = "Оператор instanceof нужен для того, чтобы проверить, был ли объект, на которую ссылается " +
                "переменная X, создан на основе какого-либо класса Y.\n" +
                "Оператор instanceof проверяет именно происхождение объекта, а не переменной.";
        if (text.indexOf('а') != -1 && text.lastIndexOf('б') != -1) {
            System.out.println(text.substring(text.indexOf('а'), text.lastIndexOf('б') + 1));
        } else {
            System.out.println("Ошибка, нет такой буквы в исходном тексте");
        }
    }
}