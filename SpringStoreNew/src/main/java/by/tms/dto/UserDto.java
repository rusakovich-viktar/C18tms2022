package by.tms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.UniqueElements;

@Getter
@Setter
@ToString
@SuperBuilder
@EqualsAndHashCode

public class UserDto {
    @UniqueElements
    @NotEmpty
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 30, message = "Name should not be between 2 and 30 character")
    @UniqueElements
    private String username;
    private String name;
    private String surname;
    private String gender;
    @Past(message = "Birthday should not be magic date")
    private String birthday;
    @Email(message = "email should be valid")
    @NotEmpty
    private String email;
    private String registrationDate;

    public UserDto(String username, String name, String surname, String gender, String birthday, String email, String registrationDate) {
    }

    public UserDto(Long id, String username, String name, String surname, String gender, String birthday, String email, String registrationDate) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.registrationDate = registrationDate;
    }
}
