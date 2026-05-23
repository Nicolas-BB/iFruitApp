package br.com.ifruitapp.services;

import org.springframework.stereotype.Service;

import br.com.ifruitapp.entities.User;
import br.com.ifruitapp.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }
}
