package com.ayush.mongodb.repo;

import com.ayush.mongodb.model.Student;
import com.ayush.mongodb.pojo.StudentPojo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.*;

public interface StudentMongoRepo extends MongoRepository<Student,String> {

    @Query("{name: '?0'}")
    Student findByName(String name);

    @Query("   lookup:\n" +
            "      {\n" +
            "         from: faculty,\n" +
            "         localField: faculty,\n" +
            "         foreignField: id ,\n" +
            "         as:  \n" +
            "      }\n" +
            "}")
    List<StudentPojo> findStudentDetails();
}
