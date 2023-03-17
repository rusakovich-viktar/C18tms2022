package by.tms.onlinestore.repository;

import by.tms.onlinestore.model.User;
import java.util.List;

public interface UserRepository extends Repository {

    List<User> findUsersLoginPasswordAndPutAllInList();

    void addNewUser(User user);

    User findUserByLoginAndPassword(String login, String password);
}