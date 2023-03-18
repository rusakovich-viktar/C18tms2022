package by.tms.onlinestore.model;

import by.tms.onlinestore.dto.UserDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
public class User extends UserDto {

    private String password;

    public User(String username, String name, String surname, String gender, String birthday, String email, String registrationDate, String password) {
        super(username, name, surname, gender, birthday, email, registrationDate);
        this.password = password;
    }
}
