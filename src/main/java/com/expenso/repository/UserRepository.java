package com.expenso.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expenso.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, Long> {
	public UserEntity findByUname(String name);
}
