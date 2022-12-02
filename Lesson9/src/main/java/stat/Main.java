package stat;

public class Main {
    public static void main(String[] args) {

        System.out.println(CountInstanceClass.count);


        StaticTest staticTest = new StaticTest();//1 объект
        System.out.println(StaticTest.price);

        StaticTest staticTest2 = new StaticTest();//2 объект
        StaticTest.price++;

        System.out.println(staticTest.getPrice());
        StaticTest.price++;

        System.out.println("--------");
        System.out.println(staticTest2.getPrice());
        System.out.println(staticTest.getPrice());
        System.out.println(StaticTest.price);
        System.out.println("--------");
        System.out.println(staticTest.addPrice(10));//выводим значение просуммированное

        System.out.println(staticTest2.getPrice());
        System.out.println(staticTest.getPrice());
        System.out.println(StaticTest.price);

//        String[] strings = {"I", "love", "learning", "on", "JavaRush"};
//        List<String> wordsList = Arrays.asList(strings);
    }
}
