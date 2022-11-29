//model.PersonRegistry содержит список людей (model.Person), которые могут быть призваны в армию

package model;

public class PersonRegistry {

    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }
}