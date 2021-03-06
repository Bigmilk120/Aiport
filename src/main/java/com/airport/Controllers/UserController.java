package com.airport.Controllers;

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


    @GetMapping(value="/usersShow")
    public List<User> usersShow(){
        return userRepository.findAll();
    }

    @PostMapping(value="/userAdd")
    public void addUser(@RequestBody User user){
        userRepository.insert(user);
    }

    @PostMapping(value="/logging")
    public boolean loggingUSer(@RequestBody User temp){
        if(userRepository.findByFirstNameEqualsAndPasswordEquals(temp.getFirstName(), temp.getPassword())==null)
            return false;
        return true;
    }

}
