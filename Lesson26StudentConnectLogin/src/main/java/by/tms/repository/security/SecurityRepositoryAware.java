package by.tms.repository.security;

import by.tms.model.User;
import java.util.List;

public interface SecurityRepositoryAware {

    List<User> findUserLoginPassword();

    void addNewUser(User user);
}