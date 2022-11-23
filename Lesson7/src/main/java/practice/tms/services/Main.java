package practice.tms.services;

import by.tms.model.Address;
import by.tms.model.Person;


public class Main {
    public static void main(String[] args) {
//        int[] ints = new int[];
        Address minsk = new Address("Minsk");
        Person person = new Person(12, true, "Николай", minsk);//объект человека(экземпляр класса)
        person.setAddress(minsk);
//        person.test();
//        person.test(2);
        System.out.println(person);
        p0.Person person1 = new p0.Person("12", 3);
        person1.setName("234");

//        int age = person.getAge();
//        person.setAge(18);
////        person.addAge(6);
//        if (age == 18) {
//            person.setAddress(new Address("Витебск"));
//        }
//        System.out.println(++age);


//        person.age = 23;
//        person.name = "Николай";
//        person.flag = true;

//        test(person);


//        Constants constants = new Constants();//так не делаем


//        Math math = new Math();


//        System.out.println(PATH);
//        int result = max(34, 67) + 34;

//        System.out.println(person.age + " " + person.name);


//        Person2 person21 = new Person2(3, "sdf");
//        Person2 person2333 = new Person2(5, "sdf333");
//        Person2 person22 = new Person2();

    }

    private static void test(Person person) {
        System.out.println(person);
//        person.name = "Юра";
    }
}
