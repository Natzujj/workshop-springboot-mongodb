package com.natzujj.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.natzujj.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

		
	
}
