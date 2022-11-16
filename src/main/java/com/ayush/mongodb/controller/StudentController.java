package com.ayush.mongodb.controller;

import com.ayush.mongodb.model.Student;
import com.ayush.mongodb.pojo.StudentPojo;
import com.ayush.mongodb.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity saveStudent(@RequestBody StudentPojo student){
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity fetchStudentById(@PathVariable("id") String id){
        return ResponseEntity.of(Optional.of(studentService.getStudentById(id)));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity fetchStudentByName(@PathVariable("name") String name){
        return ResponseEntity.of(Optional.of(studentService.getStudentByName(name)));
    }

    @GetMapping
    public ResponseEntity fetchAll(){
        return ResponseEntity.of(Optional.of(studentService.getAllStudent()));
    }

}
