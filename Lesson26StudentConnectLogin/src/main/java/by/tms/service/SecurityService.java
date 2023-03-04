package by.tms.service;

import by.tms.model.User;
import by.tms.repository.security.SecurityRepositoryAware;
import java.util.List;

public class SecurityService {

    private final SecurityRepositoryAware securityRepository;

    public SecurityService(SecurityRepositoryAware securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<User> findUserLoginPassword() {
        return securityRepository.findUserLoginPassword();
    }

    public void addNewUser(User user) {
        securityRepository.addNewUser(user);
    }

}
