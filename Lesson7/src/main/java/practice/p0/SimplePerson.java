package practice.p0;

/**
 * https://metanit.com/java/tutorial/3.1.php
 */
public class SimplePerson {

    //схема трактора, и конкретный экземляр который ездит по полю
    //Класс это шаблон, схема, описание, a объект представляет экземпляр этого класса
    //глобальная переменная
    private String name; //характиристики, свойства
    private int age;
    private int height;
    private SimpleAddress address;

//    protected SimplePerson() {
//        System.out.println("SimplePerson constructor");
//    }
//
//    public SimplePerson(String name) {
//        this.name = name;//локальная переменная
//    }
//
//    public SimplePerson(int age) {
//        this.age = age;
//    }
//
//    public SimplePerson(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public SimplePerson(String name, int age, int height, SimpleAddress address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAddress(SimpleAddress address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public SimpleAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SimplePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", address=" + address +
                '}';
    }

    //    SimpleAddress address;
//
//
//    public SimplePerson(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public SimplePerson() {
//    }
//
    //поведение, способность дать информацию о себе
    public void info() {
        System.out.println("Привет меня зовут " + name + age + height);
    }

    //
//    void securedInfo() {
//        System.out.println(name + " " + age);
//    }
//
    void changeName(String name, int age) {
        System.out.println("age " + age);
        this.name = name;
        this.age = 111;
        System.out.println(age);
    }

//    public String toString() {
//        return "SimplePerson{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address=" + address +
//                '}';
//    }
}
