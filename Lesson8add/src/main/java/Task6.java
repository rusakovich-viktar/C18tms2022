import java.util.Arrays;
/* 6. Создайте массив строк. Заполните его произвольными именами
        людей.
        Отсортируйте массив.
        Результат выведите на консоль.*/

public class Task6 {
    public static void main(String[] args) {
        String[] namesList = new String[]{"Сильвана", "Павел", "Виктор", "Малфурион", "Николай", "Виктория", "Никита", "Рагнарос", "Артас", "Тралл"};
        Arrays.sort(namesList);
        System.out.println(Arrays.toString(namesList));
    }
}