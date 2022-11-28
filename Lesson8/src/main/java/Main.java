import model.Address;
import model.Person;

import static utils.Constants.FEMALE;
import static utils.Constants.MALE;

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
        people[8] = new Person("Александр", 26, MALE, new Address("Belarus", "Brest"));
        people[9] = new Person("Аверьян", 24, MALE, new Address("Belarus", "Borisov"));

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);

        }
    }


}
