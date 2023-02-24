package by.tms;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

//     * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
//             * List<Car> cars = Arrays.asList(
//        *             new Car("AA1111BX", 2007),
//        *             new Car("AK5555IT", 2010),
//        *             new Car(null, 2012),
//        *             new Car("", 2015),
//        *             new Car("AI3838PP", 2017));
//        *
//        * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
public class Task4 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        cars.stream()
                .filter(year -> year.getYear() > 2010)
                .map(Car::getNumber)
                .filter(StringUtils::isNotEmpty)
                .forEach(System.out::println);
    }
}

class Car {
    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }
}