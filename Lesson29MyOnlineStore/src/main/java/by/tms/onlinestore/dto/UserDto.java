package by.tms.onlinestore.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private String username;
    private String name;
    private String surname;
    private String gender;
    private String birthday;
    private String email;

    public UserDto(String username) {
        this.username = username;
    }

}
