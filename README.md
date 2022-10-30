# C18tms2022
Материалы по обучению TeachMeSkills, группа C18-onl-2022.

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&size=30&duration=2000&pause=200&color=04A193&center=true&vCenter=true&multiline=true&width=435&height=150&lines=%D0%98%D0%B4%D0%B8+%D1%81+%D0%BC%D0%B8%D1%80%D0%BE%D0%BC%2C+%D0%B2%D0%BE%D0%B8%D0%BD;%D1%82%D1%83%D1%82+%D0%BD%D0%B5%D1%87%D0%B5%D0%B3%D0%BE+%D1%81%D0%BC%D0%BE%D1%82%D1%80%D0%B5%D1%82%D1%8C;%D1%8F+%D0%BF%D1%80%D0%BE%D1%81%D1%82%D0%BE+%D1%83%D1%87%D1%83%D1%81%D1%8C)](https://git.io/typing-svg)

<details>
<summary>Lesson1</summary>
 
Написать простую программу Hello руками с использованием (javac и java) без IntelliJ IDEA
  
Task2: PositiveNumbers
Найти количество положительных чисел. Даны несколько целых чисел через пробел (вводит пользователь через консоль).
Ответ должен быть в виде: количество положительных чисел = xxx.

</details>

<details>
<summary>Lesson2</summary>
 

public class HomeWork {
    public static void main(String[] args) {
        /*
        1) Создать от ветки main ветку develop и запушить (Внимание! если вы создали ветку ее можно запушить сразу же без коммита).
        (Остаемся на ветке develop)
        2) В Идее ставим курсор на названии проекта С18onl2022 и создаем новый модуль(правой клавишей мыши new->module),
        Название Lesson2, build system maven
        3) В в папке Lesson2->java создать файл Test.java
        4) Создать 2 дополнительные ветки features/TMS1, bugfix/TMS1 от ветки develop
        5) В ветке features/TMS1 изменить файл Test.java(добавляем вывод на консоль "Hello git")
         и создать пулреквест ветки features/TMS1 к ветке develop
        6) Обновите ветку bugfix/TMS1 из features/TMS1(переключаемся на bugfix/TMS1,
        кликаем на ветку features/TMS1 и выбираем Merge into Current). Добавляем еще 2 файла Test2.java и Test3.java в папку java,
        коммитим и пушим изменения. Удаляем файл Test2.java, делаем коммит и пуш и создаем пулреквест
        ветки bugfix/TMS1 к develop (при создании пул реквеста можно выбирать из какой ветки сливать изменения в какую ветку)
        Итого: Должно быть 2 пул реквеста(features/TMS1 в develop и bugfix/TMS1 в develop)
        7)*(Со звездой) Создать ветку features/TMS2 от main, далее перейти в ветку develop и добавить
        файл с название Cherry.java закомитить(название коммита дать jerry) и запушить. Выполнить комманду cherry pick
        коммита jerry с изменениями в ветку features/TMS2. Сделать коммит и пуш ветки features/TMS2. Создать пул реквест
        ветки features/TMS2 в ветку main
        Итого: Должен быть 1 пул реквест из features/TMS2 в ветку main
         */
    }
}

</details>


<details>
<summary>Lesson3</summary>
 
#Lesson3:
  public class HomeWork {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3,4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        return 0;
    }

    /**
     *
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        return 0;
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        return 0;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        return 0;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     *
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return 0;
    }
}

</details>


