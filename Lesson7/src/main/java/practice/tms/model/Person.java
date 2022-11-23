package practice.tms.model;

import java.util.ArrayList;

public class Person {

    public static final String MY = "sdfdsf";

    public static final ArrayList<String> myList;

    static {
//        temp = "123";
        myList = new ArrayList<>();
        myList.add("234");
        myList.add("234");
        myList.add("234");
        myList.add("234");
        System.out.println("static block");
    }

    //false
    private String temp;
//    {
//        System.out.println("logic block");
//        temp = "12223";
//    }

    //характеристики(глобальные переменные) поля
    int age;//0
    private boolean flag = true;
    private Address address;//null
    private String name;//null

    public Person() {
        System.out.println("конструктор без параметров");
    }

    public Person(int age, boolean flag, String name, Address address) {
        System.out.println("конструктор с парамерами");
        this.age = age;
        this.flag = flag;
        this.name = name;
        this.address = address;
    }

    public void test(int value) {
        System.out.println(MY);
        System.out.println(++value);
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    void test() {
        System.out.println("");
    }

    //    public Person() {
//    }
//
//    public Person(int age, String name) {
//        this(age, true, name, new Address("Минск"));
//    }

    @Override
    public String toString() {
        test(3);
        return "Person{" +
                "age=" + age +
                ", flag=" + flag +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
