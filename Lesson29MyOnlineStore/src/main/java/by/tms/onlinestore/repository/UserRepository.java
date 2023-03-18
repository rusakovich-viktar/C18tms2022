package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.User;

public interface UserRepository extends Repository {

    void addNewUser(User user);

    User getUserByLoginAndPassword(String login, String password);
}