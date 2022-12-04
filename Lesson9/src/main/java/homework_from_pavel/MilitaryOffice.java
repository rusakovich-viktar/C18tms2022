package homework_from_pavel;

import static homework_from_pavel.Sex.MALE;

public class MilitaryOffice {
    private PersonRegistry personRegistry;//регистратура

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
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

    //вывести количество призывников у которых имя Александр.
    public Person[] getRecruits(String name) {
        Person[] persons = personRegistry.getPersons();
        Person[] personRecruits = new Person[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            //АлеКсандр, АЛЕКСАНДР, алесандр
            if (checkRecruits(person) && person.getName().equalsIgnoreCase(name)) {
                personRecruits[i] = person;
            }
        }
        return personRecruits;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(MALE);
    }
}
