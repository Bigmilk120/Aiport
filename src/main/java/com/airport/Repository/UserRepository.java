package com.airport.Repository;

import com.airport.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, String> {
    User findByFirstNameEqualsAndPasswordEquals(String username, String password);
}
