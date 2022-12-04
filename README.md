# C18tms2022

Материалы по обучению TeachMeSkills, группа C18-onl-2022.

TaskList:

<details>
<summary>Lesson1</summary>


        /*Task1: Написать простую программу Hello руками с использованием (javac и java) без IntelliJ IDEA; Task2: PositiveNumbers; 
        Найти количество положительных чисел. Даны несколько целых чисел через пробел (вводит пользователь через консоль). 
        Ответ должен быть в виде: количество положительных чисел = xxx.;
         */

</details>

<details>
<summary>Lesson2</summary>

    
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

</details>


<details>
<summary>Lesson3</summary>
 
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
     2
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
     3 Метод должен вернуть среднее значение из массива чисел
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
     4 Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        return 0;
    }

    /**
     5 Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
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

</details>


<details>
<summary>Lesson 4.1</summary>

	Задачи:
	1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

	2)Проверка четности числа
	Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
 	чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
 	Если пользователь введёт не целое число, то сообщать ему об ошибке.

	3) Меньшее по модулю число
	Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
	 пользователем вещественных чисел с консоли.

	4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
 	оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
 	когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
 	(т.е. рабочий день закончился).
	Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
 	Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
 	сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
	Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
	 далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
	 выводиться фраза о количестве полных часов, содержащихся в n секундах.

	5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
              byte	short	char	int 	long	float	double	boolean
    byte
    short
    char
    int
    long
    float
    double
    boolean

    На пересечении напишите следующие фразы:
    ня (неявное) – если преобразование происходит автоматически,
    я (явное) – если нужно использовать явное преобразование,
    х – если преобразование невозможно,
    т  - если преобразование тождественно.
    Внимание! используйте System.out.printLn


</details>


<details>
<summary>Lesson 4.2</summary>


        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     1 Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
    }

    /**
     2 Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        // тут пишем логику
        return 0;
    }

    /**
     3 На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        return 0;
    }

    /**
     4 На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
    }

    /**
     5 Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
    }

    /**
     6 Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику

</details>

<details>
	<summary>Lesson 5</summary>
 
 	import java.util.Random;

	public class HomeWork {
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
        printMatrix();
    }
	//        Задачи:
	//1) Задача на оператор switch!
	//        Рандомно генерируется число От 1 до 7.
	//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
	//        Если 6 или 7 – “Выходной”.

	//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
	//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

	//3) В переменную записываем число.
	//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
	//        Например, Введите число: 5
	//        "5 - это положительное число, количество цифр = 1"

	//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.


	//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
	//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

	//        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

	//        a)                  b)
	//              *        *
	//            * *        * *
	//          * * *        * * *
	//        * * * *        * * * *
	//
	//        c)                  d)
	//        * * * *        * * * *
	//          * * *        * * *
	//            * *        * *
	//              *        *


	//        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
	//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

	//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
	//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
	//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

	//        9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
	//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
	//        Снова выведете массив на экран на отдельной строке.

	//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

	//        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
	//        Пример: {0,3,46,3,2,1,2}
	//        Массив имеет повторяющиеся элементы 3, 2
	//        Пример: {0,34,46,31,20,1,28}
	//        Массив не имеет повторяющихся элементов

	//        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
	//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
	//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
	//        Пример:
	//          1 2 3 4      1 6 3 1
	//          6 7 8 9      2 7 3 5
	//          3 3 4 5      3 8 4 6
	//          1 5 6 7      4 9 5 7


		/**
		 * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
		 */

		}


		/**
		 * Шаги по реализации:
		 * - Прочитать два int из консоли
		 * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
		 * - Заполнить массив случайными значениями (до 100)
		 * - Вывести в консоль матрицу заданного размера, но:
		 * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
		 * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
		 * - В противном случае выведите "*"
		 * <p>
		 * Example:
		 * - Значения с консоли - 2 и 3
		 * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
		 * 6 11 123
		 * 1 14 21
		 * - Для этого значения вывод в консоли должен быть:
		 * <p>
		 * + * *
		 * * - +
		 * <p>
		 * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
		 */
		public static void printMatrix() {
			char[][] mass = new char[3][3];
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++) {
					//21
					if (mass[i][j] % 3 == 0) {
						mass[i][j] = '+';
					} else if (mass[i][j] % 7 == 0) {
						mass[i][j] = '-';
					} else {
						mass[i][j] = '*';
					}
				}
			}
		}

	//    Доп задача!
	//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
	//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
	//    Пример:
	//            *Для простоты пример показан на одномерном массиве размера 10
	//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
	//    Вывод в консоль:
	//            11535 (0,5)
	//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.
	}


</details>

<details>
<summary>Lesson 6</summary>
	
	Алгоритмы, сортировки, О
	
</details>


<details>
<summary>Lesson 7</summary>
 
public class HomeWork {

    /**
     *
     * 1) Создать класс User для хранения о обработки данных о пользователе.
     * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
     *  - Возврата имени и фамилии полностью
     *  - Увеличения возраста
     *  - Вывода общей информации о пользователе
     *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
     * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
     * В этом конструкторе сделать вызов другого конструктора этого же класса.
     * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
     */

    /**
     * в папке src/main/java создать пакет by.tms.model
     * в пакете создать класс Computer
     * 1) класс Computer будет содержать следующие поля:
     * - процессор
     * - оперативка
     * - жесткий диск
     * - ресурс полных циклов работы (включился выключился это один цикл)
     *
     * 2) класс Computer будет содержать следующие методы:
     * - метод описание(вывод всех полей)
     * - метод включить (on())
     *     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
     *     на консоль вывести сообщение (Внимание! Введите 0 или 1)
     *     создать экземпляр класса Random, который будет генерировать число 0 или 1.
     *     если введенное вами число совпадет с рандомным, то компьютер выключается.
     *     если введенное вами число не совпадет с рандомным, то компьютер сгорает.
     *     - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
     * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
     *    ресурса полных циклов работы
     * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
     *
     * 3) создать пакет by.tms.service
     * создать класс Main создать метод main
     * создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
     * т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
     * Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
     * и выводу информации про него.
     */


</details>


<details>
<summary>Lesson 8add - Доп урок массивы и тд</summary>
 
	public class HomeWork {
		/*
		Домашнее задание по массивам
	Основное задание
	0. Создайте массив целых чисел. Напишете программу, которая выводит
	сообщение о том, входит ли заданное число в массив или нет.
	Пусть число для поиска задается с консоли (класс Scanner).
	1. Создайте массив целых чисел. Удалите все вхождения заданного
	числа из массива.
	Пусть число задается с консоли (класс Scanner). Если такого числа нет -
	выведите сообщения об этом.
	В результате должен быть новый массив без указанного числа.
	2. Создайте и заполните массив случайным числами и выведете
	максимальное, минимальное и среднее значение.
	Для генерации случайного числа используйте метод Math.random().
	Пусть будет возможность создавать массив произвольного размера.
	Пусть размер массива вводится с консоли.
	3. Создайте 2 массива из 5 чисел.
	Выведите массивы на консоль в двух отдельных строках.
	Посчитайте среднее арифметическое элементов каждого массива и
	сообщите, для какого из массивов это значение оказалось больше (либо
	сообщите, что их средние арифметические равны).
	Дополнительное задание
	4. Создайте массив из n случайных целых чисел и выведите его на экран.
	Размер массива пусть задается с консоли и размер массива может быть
	больше 5 и меньше или равно 10.
	Если n не удовлетворяет условию - выведите сообщение об этом.
	Если пользователь ввёл не подходящее число, то программа должна
	просить пользователя повторить ввод.
	Создайте второй массив только из чётных элементов первого массива,
	если они там есть, и вывести его на экран.
	5. Создайте массив и заполните массив.
	Выведите массив на экран в строку.
	Замените каждый элемент с нечётным индексом на ноль.
	Снова выведете массив на экран на отдельной строке.
	6. Создайте массив строк. Заполните его произвольными именами
	людей.
	Отсортируйте массив.
	Результат выведите на консоль.
	7.Реализуйте алгоритм сортировки пузырьком.

	Домашнее задание по матрицам
	Основное задание
	8. Создать трехмерный массив из целых чисел.
	С помощью циклов "пройти" по всему массиву и увеличить каждый
	элемент на заданное число. Пусть число, на которое будет
	увеличиваться каждый элемент, задается из консоли.
	9. Шахматная доска
	Создать программу для раскраски шахматной доски с помощью цикла.
	Создать двумерный массив String'ов 8х8. С помощью циклов задать
	элементам циклам значения B(Black) или W(White). Результат работы
	программы:
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	Дополнительное задание
	10. Создайте двумерный массив целых чисел. Выведите на консоль сумму
	всех элементов массива.
	11. Создайте двумерный массив. Выведите на консоль диагонали массива.
	12. Создайте двумерный массив целых чисел. Отсортируйте элементы в
	строках двумерного массива по возрастанию.
		 */

</details>


<details>
<summary>Lesson 8</summary>
 
 
	 //1) задача!
		/*
		Необходимо написать военкомат.
		1) Создаем класс военкомат MilitaryOffice
		2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
		3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
		4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
		Военкомат должен уметь:
		a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
		T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
		(годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
		б) вывести количество годных призывников в городе Минске.
		в) вывести количество призывников от 25 до 27 лет
		г) вывести количество призывников у которых имя Александр.
		5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
		*/

		//2) задача!
		/*
	 Напишите структуру классов и продемонстрируйте работу
	 - Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
	 - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
	 - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
	 - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
	 - Если машина не заведена, ехать она не может.
	 - Машину можно заглушить.
	 - После каждой поездки считаем, что машина прошла фиксированное расстояние.
	 - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
	 - Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
	 - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
	 (не обязательно задавать в конструкторе)
	 - После создания поменять двигатель машине нельзя.
	 - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
	 - Машину можно дозаправить, можно проверить сколько топлива осталось.
	 - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
	 сколько бензина сейчас и т.д.
		 */
	}

</details>



<details>
<summary>Список будет пополняться</summary>
 

</details>
