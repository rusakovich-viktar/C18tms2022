package by.tms.utils;

import by.tms.dto.UserDto;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class Utils {

    public static boolean isUserLogIn(UserDto userDto) {
        return Optional.ofNullable(userDto).isPresent();
    }
}
