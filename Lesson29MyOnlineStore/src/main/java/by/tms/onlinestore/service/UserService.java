package by.tms.onlinestore.service;

import by.tms.onlinestore.model.User;
import by.tms.onlinestore.repository.UserRepository;
import java.util.List;

public class UserService {

    private final UserRepository userRepositoryImpl;

    public UserService(UserRepository userRepositoryImpl) {
        this.userRepositoryImpl = userRepositoryImpl;
    }

    public List<User> findUsersLoginPasswordAndPutAllInList() {
        return userRepositoryImpl.findUsersLoginPasswordAndPutAllInList();
    }

    public void addNewUser(User user) {
        userRepositoryImpl.addNewUser(user);
    }

}
