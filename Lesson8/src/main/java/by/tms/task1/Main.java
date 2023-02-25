package by.tms.task1;

import static by.tms.task1.utils.Constants.FEMALE;
import static by.tms.task1.utils.Constants.MALE;

import by.tms.task1.model.Address;
import by.tms.task1.model.MilitaryOffice;
import by.tms.task1.model.Person;
import by.tms.task1.model.PersonRegistry;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[10];

        people[0] = new Person("Виктор", 31, MALE, new Address("Belarus", "Minsk"));
        people[1] = new Person("Павел", 34, MALE, new Address("Belarus", "Minsk"));
        people[2] = new Person("Евгений", 30, MALE, new Address("USA", "NewYork"));
        people[3] = new Person("Ольга", 16, FEMALE, new Address("Belarus", "Grodno"));
        people[4] = new Person("Никита", 20, MALE, new Address("Belarus", "Chachkovo"));
        people[5] = new Person("Анастасия", 22, FEMALE, new Address("Belarus", "Dzerjinsk"));
        people[6] = new Person("Станислав", 20, MALE, new Address("Belarus", "Minsk"));
        people[7] = new Person("Артем", 25, MALE, new Address("Belarus", "Minsk"));
        people[8] = new Person("Александр", 26, MALE, new Address("Belarus", "Minsk"));
        people[9] = new Person("Александр", 24, MALE, new Address("Belarus", "Borisov"));

        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(people));

        int recruitsAlexander = militaryOffice.getRecruits("Александр");
        System.out.println("призывников с именем Александр " + recruitsAlexander);

        int recruits = militaryOffice.getRecruits();
        System.out.println("Количество годных всего " + recruits);

        System.out.println("Количество в возрастном диапазоне " + militaryOffice.getRecruitsByAge(25, 30));

        System.out.println("Количество годных бойцов в городе " + militaryOffice.getRecruitsInCity("Minsk"));

    }
}