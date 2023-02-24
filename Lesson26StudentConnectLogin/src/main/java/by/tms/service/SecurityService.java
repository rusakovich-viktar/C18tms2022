package by.tms.service;

import by.tms.User;
import by.tms.repository.SecurityRepositoryAware;

import java.util.List;

public class SecurityService {
    private final SecurityRepositoryAware securityRepository;

    public SecurityService(SecurityRepositoryAware securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<User> findUserLoginPassword() {
        return securityRepository.findUserLoginPassword();
    }

}
