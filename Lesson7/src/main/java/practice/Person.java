package practice;

public class Person {
    public static String MM;
    public static final int MIN_AGE = 18;//минимальный и максимальный возраст призывника
    public static final int MAX_AGE = 27;

    public String name; //характиристики, свойства
    public int age;
    public int height;

    static int[] numbers = {1, 2, 3, 4};

    //инициализатор
    {//static - инициализация статический контент(один раз работает)
        System.out.println("block init");
        //MM = "Constanta";
        age = 10;
    }

    {
        age = 1; // устанавливает по умолчанию значение
        System.out.println("Init");
    }

    static {
        System.out.println(MM);
        System.out.println(MIN_AGE);
        System.out.println("static block");
        MM = "MMM";
    }

    //конструктор после инициализатора
    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name) {
        this(name, 30);
        System.out.println("Constructor with name");
//        this.name = name;
//        this.name = "!!!";
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        this.height = 180;
        System.out.println("Constructor with name and age");
    }

//    public Person(String name, int age, int height) {
//        this(name, age);
//        this.height = height;
//    }

    //поведение, способность дать информацию о себе
    void info() {
        System.out.println("Привет меня зовут " + name);
    }
}
