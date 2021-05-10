package com.expenso.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.expenso.entity.ArticleEntity;


public interface ArticleRepository extends MongoRepository<ArticleEntity, Long> {
	
}
