package CarMilitaryLesson8.tms.model;

import java.util.Arrays;

import static by.tms.utils.Constants.MAX_AGE;
import static by.tms.utils.Constants.MIN_AGE;

public class PersonRegistry {
    private Person[] people;

    public PersonRegistry(Person[] people) {
        this.people = people;
    }

    public Person[] getRecruits() {
        return getRecruits(MIN_AGE, MAX_AGE);
    }

    public Person[] getRecruits(int from, int to) {
        Person[] recruits = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (person.getAge() >= from && person.getAge() <= to && person.getSex().equalsIgnoreCase("MALE")) {
                recruits[count] = person;
                count++;
            }
        }
//        Arrays.sort(recruits);
//        Александр null null Александр
        return Arrays.copyOf(recruits, count);
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}
