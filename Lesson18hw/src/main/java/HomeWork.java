import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://www.baeldung.com/java-calculate-factorial#:~:text=Factorial%20Using%20a%20for%20Loop,for%20numbers%20up%20to%2020.
public class HomeWork {
    /**
     * Основное задание
     * 1. Написать программу для вывода на консоль названия дня недели по
     * введенной дате.
     * 2. Написать программу для вывода на экран дату следующего вторника.
     * <p>
     * Дополнительное задание
     * 3. Создать обобщенный функциональный интерфейс.
     * Написать класс с одним методом.
     * В этом методе реализуйте логику:
     * - если в консоль введена цифра 1, то: использования интерфейса со
     * строковым типом и передать в метод интерфейса логику реверса
     * строки(вывода строки в обратном порядке).
     * - если в консоль введена цифра 2, то: использования интерфейса с
     * целочисленным типом и передать в метод интерфейса логику
     * нахождения факториала числа.
     */
    public static void main(String[] args) {
//        String date = "2023.01.02";
//        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//        System.out.println(localDate.getDayOfWeek());

        int dayOfWeek = 3; // Monday
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

// calculate how much to add
        int days = dayOfWeek - weekday;
        if (days <= 0) {
            days += 7;
        }
        now.add(Calendar.DAY_OF_YEAR, days);

// now is the date you want
        Date date = now.getTime();
        String dateStr = new SimpleDateFormat("E dd.MM.yyyy").format(date);
        System.out.println("dateStr = " + dateStr);
    }
}