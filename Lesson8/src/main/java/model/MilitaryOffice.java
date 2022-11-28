package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MilitaryOffice {
    private PersonRegistry personRegistry;


    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }
}
