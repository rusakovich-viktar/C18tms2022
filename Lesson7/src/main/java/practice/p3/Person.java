package practice.p3;


import java.util.ArrayList;
import java.util.List;

public class Person {

    public static List<Integer> COUNT_PERSONS = init();
    public static final List<Integer> COUNT_PERSONS2 = new ArrayList<Integer>() {{
        add(1);
        add(2);
    }};

    public static final String CC = "2334";

    public static int COUNT;

    private int age;
    private String name;
    private int height;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }


    {
        System.out.println("Count = 0");
        COUNT = 10;
    }

    {
        age = 50;
    }

    static List<Integer> init() {

        COUNT_PERSONS = new ArrayList<Integer>();
        COUNT_PERSONS.add(1);
        COUNT_PERSONS.add(2);
        return COUNT_PERSONS;
    }

    static {
        System.out.println(CC);
        System.out.println("Init 1");
//        CC = "fff";
        System.out.println(CC);
//        age = 12;
    }


    public Person() {
        height = 200;
        System.out.println("Default");
    }

    public Person(int age, String name) {
        this(age);
        this.name = name;
        System.out.println("Person with name and age");
    }

    public Person(String name) {
        this.age = 180;
        this.name = "ll";
    }

    public Person(int age) {
        this();
        this.age = age;
        System.out.println("Person with age");
    }

    public void info() {
        System.out.println("Name " + name + " Age " + age);
    }

}
