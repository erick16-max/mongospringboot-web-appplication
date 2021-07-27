package com.gege254.mongospringboot.repositories;


import com.gege254.mongospringboot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author didin
 */
public interface UserRepository extends MongoRepository<User, String> {
    
    User findByEmail(String email);
    
}