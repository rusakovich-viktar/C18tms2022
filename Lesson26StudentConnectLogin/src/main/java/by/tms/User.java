package by.tms;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class User {
    private String username;
    private String password;

//    {
//        username = "admin";
//        password = "admin";
//    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
