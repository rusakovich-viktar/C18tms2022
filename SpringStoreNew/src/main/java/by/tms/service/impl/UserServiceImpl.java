package by.tms.service.impl;

import by.tms.dto.UserDto;
import by.tms.model.User;
import by.tms.repository.UserRepository;
import by.tms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        return userRepository.getUserByLoginAndPassword(login, password);
    }

    @Override
    public void addNewUser(User user) {
        userRepository.addNewUser(user);
    }

    @Override
    public void updateUser(UserDto userDto) {
        userRepository.updateUserDtoById(userDto);
    }

    @Override
    public UserDto findUserDtoById(Long id) {
        return userRepository.findUserDtoById(id);
    }

}
