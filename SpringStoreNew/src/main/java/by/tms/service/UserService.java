package by.tms.service;

import by.tms.dto.UserDto;
import by.tms.model.User;

public interface UserService {
    User getUserByLoginAndPassword(String login, String password);

    void addNewUser(User user);

    void updateUser(UserDto userDto);

    UserDto findUserDtoById(Long id);

}
