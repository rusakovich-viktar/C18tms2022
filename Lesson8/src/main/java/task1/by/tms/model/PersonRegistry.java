//model.PersonRegistry содержит список людей (model.Person), которые могут быть призваны в армию

package task1.by.tms.model;

import lombok.Getter;

@Getter
public class PersonRegistry {

    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

}
