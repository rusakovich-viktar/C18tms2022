//model.PersonRegistry содержит список людей (model.Person), которые могут быть призваны в армию

package model;

public class PersonRegistry {

    private Person[] people;

    public PersonRegistry(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }
}