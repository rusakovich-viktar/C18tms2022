package stat;

/**
 * - Это переменная, которая принадлежит классу, а не объекту (экземпляру)
 * - Статические переменные инициализируются только один раз, в начале выполнения,
 * когда вы запускаете программу и загружаете класс в первый раз (это делается загрузчиком классов, когда на класс впервые ссылаются каким-либо образом),
 * то любые статические блоки или поля «загружаются» в JVM и становятся доступными.
 * - Эти переменные сначала инициализируются, прежде чем инициализировать любые переменные экземпляра
 * - Единая копия, которая будет использоваться всеми экземплярами класса
 * - Статическую переменную можно получить непосредственно по имени класса и не нужен какой-либо объект
 * <p>
 * Ссылки:
 * https://javarush.ru/groups/posts/modifikator-static-java
 * https://javarush.ru/groups/posts/2183-staticheskie-vlozhennihe-klassih
 * <p>
 * Задача: подсчитать сколько экземпляров класса CountInstanceClass будет создано в процессе выполнения программы.
 */
public class CountInstanceClass {

//    public static final String TEMP = "123";


    public static int count;// что если убрать private?
    private String value;

    private static String temp;
    private static String temp2 = "d://temp";


    static {
        temp = "c://temp";
    }

    public CountInstanceClass() {
        count++;
    }

//    public static CountInstanceClass(int count) { //Разобрать
//        this.count = count;
//    }


    public int getCount() {
        return count;
    }

    class Inner {
//        static int value = 0;
    }

}
