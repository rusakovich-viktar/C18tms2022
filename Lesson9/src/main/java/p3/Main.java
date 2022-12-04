package p3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(new Address("Беларусь", "Минск"), 12, "Nik", "male");
//        Recruit recruit = new Recruit("Генерал");

        Recruit recruit = Recruit.builder()
                .name("Nik")
                .age(23)
                .rank("рядовой")
                .build();

        System.out.println(recruit.getName());
        System.out.println(recruit.getRank());
        recruit.info();
        recruit.speak();


        //второй способ.
        Person newRecruit = new Recruit(new Address("Беларусь", "Минск"), 45, "Николай", "male", "рядовой");
        newRecruit.info();

        Person medicalPerson = new MedicalPerson();
        medicalPerson.setName("Alena");
        medicalPerson.setAge(23);

        print(newRecruit);//рядовой
        print(medicalPerson);//медицинский работник


        System.out.println((Person) newRecruit);

        Recruit newRecruit1 = (Recruit) newRecruit;
//        System.out.println(newRecruit.getRank()); //так нельзя вызвать компилятор ругается
        newRecruit.speak();
        System.out.println(((Recruit) newRecruit).getRank()); //мы можем привести newRecruit к типу Recruit

        //персон расширяет класс рекрут, но не каждый человек может быть рекрутом
        Person person = new Person(new Address("Беларусь", "Минск"), 45, "Николай", "male");
        person.info();
        System.out.println(person.getName());
//        System.out.println(((Recruit) person).getRank()); //так нельзя

        List<Person> persons = new ArrayList<>();
        persons.add(recruit);
        persons.add(newRecruit);
        persons.add(person);
        print(persons);

        Person newRecruitStatic = new Recruit(new Address("Беларусь", "Минск"), 45, "Николай", "male", "рядовой");
        newRecruitStatic.info();
        newRecruitStatic.personTest();//идет по сылке

        //полиморфиз, перегрузка методов
        print(recruit);
        print(person);
        print("Генерал", "sdfdsf");
    }

    private static void print(Person person) {
        System.out.println(person.getName() + person.getAge());
        if (person instanceof Recruit) {
            Recruit person1 = (Recruit) person;
            System.out.println(person1.getName() + person1.getRank());
        } else if (person instanceof MedicalPerson) {
            MedicalPerson person1 = (MedicalPerson) person;
            System.out.println(person1.getCategory());
        }
    }

    private static void print(String person, String person2) {
        System.out.println(person);
    }

    private static void print(List<Person> persons) {
        for (Person person : persons) {
            if (person instanceof Recruit) {// проверить является ли персон рекрутом
                Recruit recruit = (Recruit) person;
                if (recruit.getName().equals("Александр")) {
                    recruit.setRank("прапорщик");
                }
                System.out.println(recruit);
            }
            System.out.println(person.getName() + " " + person.getAge());
        }
    }


}
