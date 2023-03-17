package by.tms.onlinestore.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private String gender;
    private String birthday;
    private String email;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
