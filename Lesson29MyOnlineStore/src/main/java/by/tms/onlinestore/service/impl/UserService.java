package by.tms.onlinestore.service.impl;

import by.tms.onlinestore.model.Inject;
import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;
import lombok.Setter;

@Setter
public class UserService {
    @Inject
    private UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public User getUserByLoginAndPassword(String login, String password) {
        return userRepository.getUserByLoginAndPassword(login, password);
    }

    public void addNewUser(User user) {
        userRepository.addNewUser(user);
    }

}
