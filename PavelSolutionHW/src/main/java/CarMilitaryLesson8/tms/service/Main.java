package CarMilitaryLesson8.tms.service;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;
import by.tms.model.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        {
            Person person = new Person("Konstantin", 23, "MALE", new Address("minsk"));
            person.setName("123");
            people[0] = person;
        }
        {
            Person person = new Person("Konstantin", 24, "MALE", new Address("minsk"));
            person.setName("123");
            people[1] = person;
        }
        {
            Person person = new Person("Konstantin", 23, "MALE", new Address("minsk"));
            person.setName("123");
            people[2] = person;
        }
        {
            Person person = new Person("Konstantin", 23, "MALE", new Address("minsk"));
            person.setName("123");
            people[3] = person;
        }

        PersonRegistry personRegistry = new PersonRegistry(people);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        int count = militaryOffice.findCountPersonByName("Александр");
        System.out.println("Количество призывников по имени Александр =" + count);
        int countRecruitsByAge = militaryOffice.findCountRecruitsByAge(23, 25);
        System.out.println("Количество призывников от 23 до 25 лет =" + countRecruitsByAge);
    }
}
