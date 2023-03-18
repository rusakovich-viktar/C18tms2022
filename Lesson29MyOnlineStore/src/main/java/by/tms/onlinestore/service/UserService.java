package by.tms.onlinestore.service;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByLoginAndPassword(String login, String password) {
        return userRepository.getUserByLoginAndPassword(login, password);
    }

    public void addNewUser(User user) {
        userRepository.addNewUser(user);
    }

}
