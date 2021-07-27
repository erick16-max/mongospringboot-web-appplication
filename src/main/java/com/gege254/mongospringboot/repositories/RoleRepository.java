package com.gege254.mongospringboot.repositories;

import com.gege254.mongospringboot.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author didin
 */
public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
    
}