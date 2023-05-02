package by.tms.repository;

import by.tms.model.User;

public interface UserRepository extends Repository {

    void addNewUser(User user);

    User getUserByLoginAndPassword(String login, String password);
}