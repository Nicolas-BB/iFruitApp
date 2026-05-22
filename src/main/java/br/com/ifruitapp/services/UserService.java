package br.com.ifruitapp.services;

import org.springframework.stereotype.Service;

import br.com.ifruitapp.entities.User;
import br.com.ifruitapp.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    List<User> list = new ArrayList<>();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

        this.list.add(new User(1, "Amanda", "amandagdasilva01@gmail.com", "125.925.099-76"));
        this.list.add(new User(2, "Maria", "maria@gmail.com", "Não tem cpf"));
        this.list.add(new User(3, "João", "joao@gmail.com", "145.654.743-23"));
        this.list.add(new User(4, "Isadora", "isadora@gmail.com", "Não tem cpf"));
        this.list.add(new User(5, "Nelson", "nelson@gmail.com", "Não tem cpf"));
    }

    public User getUserById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (this.list.get(i).getId() == id) {
                return this.list.get(i);
            }
        }

        return null;
    }

    public List<User> getAllUsers() {
        return this.list;
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }
}
