package by.tms.onlinestore.dto;

import lombok.*;
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
