package com.ayush.mongodb.repo;

import com.ayush.mongodb.model.Faculty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacultyMongoRepo extends MongoRepository<Faculty,String> {
}
