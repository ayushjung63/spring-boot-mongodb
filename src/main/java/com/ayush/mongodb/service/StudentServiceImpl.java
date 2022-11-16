package com.ayush.mongodb.service;

import com.ayush.mongodb.model.Faculty;
import com.ayush.mongodb.model.Student;
import com.ayush.mongodb.pojo.StudentPojo;
import com.ayush.mongodb.repo.FacultyMongoRepo;
import com.ayush.mongodb.repo.StudentMongoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMongoRepo studentMongoRepo;
    private final FacultyMongoRepo facultyMongoRepo;

    @Override
    public String saveStudent(StudentPojo studentPojo) {
        Faculty faculty = facultyMongoRepo.findById(studentPojo.getFacultyId()).orElseThrow(
                () -> new RuntimeException("Faculty not found")
        );
        Student student=Student.builder()
                .name(studentPojo.getName())
                .faculty(faculty)
                .build();
        Student data = studentMongoRepo.save(student);
        return data.getId();
    }

    @Override
    public Student getStudentById(String studentId) {
        Student student = studentMongoRepo.findById(studentId).orElseThrow(
                () -> new RuntimeException("Student not found")
        );
        return student;
    }

    @Override
    public Student getStudentByName(String name) {
        return studentMongoRepo.findByName(name);
    }

    @Override
    public List<StudentPojo> getAllStudent() {
        return studentMongoRepo.findStudentDetails();
    }
}
