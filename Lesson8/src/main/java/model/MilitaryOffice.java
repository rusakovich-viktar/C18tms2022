package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.Constants;

@Setter
@Getter
@NoArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;


    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    private static boolean checkRecruits(Person person) {
        return person.getAge() > 18 && person.getAge() <= 18 && person.getGender().equals(Constants.MALE);
    }

    public int getRecruits() {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }

    public int getRecruits(String name) {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person) && person.getName().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

}

