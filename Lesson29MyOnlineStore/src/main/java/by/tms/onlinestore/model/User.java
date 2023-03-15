package by.tms.onlinestore.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
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
