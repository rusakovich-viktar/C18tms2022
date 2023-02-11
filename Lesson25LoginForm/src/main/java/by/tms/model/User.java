package by.tms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {
    private String username;
    private String password;

    {
        username = "admin";
        password = "admin";
    }
}
