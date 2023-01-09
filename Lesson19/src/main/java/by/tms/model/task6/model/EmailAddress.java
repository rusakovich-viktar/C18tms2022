package by.tms.model.task6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailAddress {
    private String email;
    private String additionalInformation; //дополнительная информация

    public EmailAddress(String email) {
        this.email = email;
    }
}
