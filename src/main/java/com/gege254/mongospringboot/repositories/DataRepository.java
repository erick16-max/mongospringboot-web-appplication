package com.gege254.mongospringboot.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import  com.gege254.mongospringboot.domain.Data;

public interface DataRepository extends MongoRepository<Data, String> {
 

 
}
