package com.leavemanager.leavemanager.repository;

import com.leavemanager.leavemanager.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
