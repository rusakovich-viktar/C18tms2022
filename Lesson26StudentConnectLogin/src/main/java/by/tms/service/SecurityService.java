package by.tms.service;

import by.tms.model.User;
import by.tms.repository.SecurityRepositoryAware;

import java.util.List;

public class SecurityService {
    private final SecurityRepositoryAware SecurityRepository;


    public SecurityService(SecurityRepositoryAware securityRepository) {
        SecurityRepository = securityRepository;
    }

    public List<User> findUserLoginPassword() {
        return SecurityRepository.findUserLoginPassword();
    }

}
