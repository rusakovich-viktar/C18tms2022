package by.tms.repository;

import by.tms.model.User;

import java.util.List;

public interface SecurityRepositoryAware {


    List<User> findUserLoginPassword();
}
