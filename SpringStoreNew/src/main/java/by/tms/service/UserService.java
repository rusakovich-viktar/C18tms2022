package by.tms.service;

import by.tms.model.User;

public interface UserService {
    User getUserByLoginAndPassword(String login, String password);

    void addNewUser(User user);
}
