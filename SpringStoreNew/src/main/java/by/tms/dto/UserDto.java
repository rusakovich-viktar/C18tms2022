package by.tms.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@SuperBuilder
public class UserDto {

    private String username;
    private String name;
    private String surname;
    private String gender;
    private String birthday;
    private String email;
    private String registrationDate;

}
