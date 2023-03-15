package by.tms.onlinestore.repository;


import by.tms.onlinestore.model.User;
import java.util.List;

public interface UserRepository {

    List<User> findUserLoginPassword();

    void addNewUser(User user);
}