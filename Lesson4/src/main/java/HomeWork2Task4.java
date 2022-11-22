/**
 * На вход приходит число.
 * Вывести в консоль фразу из разряда "_COUNT_ программистов",
 * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
 * уместное с точки зрения русского языка.
 * Пример: 1 программист, 42 программиста, 50 программистов
 *
 * @param //count - количество программистов
 */
public class HomeWork2Task4 {

    public static void countDevs(int count) {
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
//        т а а а в          в в  в   в  в                  в т

        //1, 101, 11 - исключение из правил
        int c10 = count % 10;//34 % 10 = 4       1 последняя цифра в числе
        int c100 = count % 100; //11 % 100 = 11  2 последние цифры
        if (c10 == 1 && c100 != 11) {
            System.out.println("программист");
        } else if ((c10 >= 2 && c10 <= 4) && !(c100 >= 12 && c100 <= 14)) {//true && true
            System.out.println("программиста");
        } else {
            System.out.println("программистов");
        }
    }


    public static void main(String[] args) {
        countDevs(1);
        countDevs(3);
        countDevs(5);
        countDevs(12);
        countDevs(20);
        countDevs(35);
        countDevs(111);
        countDevs(101);
        countDevs(103);
        countDevs(11);
    }
}

