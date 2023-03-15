package by.tms.onlinestore.utils;

import by.tms.onlinestore.dto.UserDto;
import java.util.Optional;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public static boolean isUserLogIn(UserDto userDto) {
        return Optional.ofNullable(userDto).isPresent();
    }
}
