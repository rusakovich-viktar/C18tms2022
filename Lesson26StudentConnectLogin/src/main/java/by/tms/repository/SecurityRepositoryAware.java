package by.tms.repository;

import by.tms.User;
import java.util.List;

public interface SecurityRepositoryAware {

    List<User> findUserLoginPassword();
}