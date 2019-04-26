package com.airport.Controllers;

import com.airport.Enums.UserPrivileges;
import com.airport.Models.User;
import com.airport.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    User loggedUser = new User();
    boolean ifLogged = false;

    @GetMapping(value="/usersShow")
    public List<User> usersShow(){
        return userRepository.findAll();
    }

    @PostMapping(value="/userAdd")
    public void addUser(@RequestBody User user){
        userRepository.insert(user);
    }

    @PostMapping(value="/logging")
    public User loggingUSer(@RequestBody User temp){
        User next = new User();
        if(userRepository.findByFirstNameEqualsAndPasswordEquals(temp.getFirstName(), temp.getPassword())==null){
            return next;
        }
        User user = userRepository.findByFirstNameEqualsAndPasswordEquals(temp.getFirstName(), temp.getPassword());
        if(user.getID()>=1){
            loggedUser.setFirstName(temp.getFirstName());
            loggedUser.setPassword(temp.getPassword());
            ifLogged = true;
            return user;
        }
        return next;
    }
}
