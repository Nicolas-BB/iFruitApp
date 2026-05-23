package br.com.ifruitapp.controllers;

import org.springframework.web.bind.annotation.*;

import br.com.ifruitapp.entities.User;
import br.com.ifruitapp.services.UserService;

@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user/list-users")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user/add-user")
    public User addUser(@RequestBody User userTarget) {
        return userService.addUser(userTarget);
    }
}
