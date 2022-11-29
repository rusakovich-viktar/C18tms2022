//model.PersonRegistry содержит список людей (model.Person), которые могут быть призваны в армию

package by.tms.task1.model;

import lombok.Getter;

@Getter
public class PersonRegistry {

    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

}
