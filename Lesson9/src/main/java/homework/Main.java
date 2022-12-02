package homework;

import java.util.Arrays;

import static homework.Sex.FEMALE;
import static homework.Sex.MALE;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[3];

        Person[] people = new Person[3];
        people[0] = new Person("Николай", 22, MALE);
        people[1] = new Person("Алекс", 23, MALE);
        people[2] = new Person("Нина", 22, FEMALE);
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(people));
        Person[] peopleNik = militaryOffice.getRecruits("Николай");
        System.out.println("призывников с именем Николай " + Arrays.toString(peopleNik));
    }
}
