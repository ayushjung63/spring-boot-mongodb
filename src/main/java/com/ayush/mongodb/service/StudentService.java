package com.ayush.mongodb.service;

import com.ayush.mongodb.model.Student;
import com.ayush.mongodb.pojo.StudentPojo;
import java.util.*;

public interface StudentService {
    String saveStudent(StudentPojo studentPojo);
    Student getStudentById(String studentId);

    Student getStudentByName(String name);

    List<StudentPojo> getAllStudent();
}
