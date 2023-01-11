package by.tms.model.task6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailAddress {
    private static final String EMAIL_PATTERN = "(\\w{2,})@(\\w+\\.)[a-z]{2,4}";
    private String email;
    private String additionalInformation; //дополнительная информация

    public EmailAddress(String email) {
        if (email.matches(EMAIL_PATTERN))
            this.email = email;
    }
}
