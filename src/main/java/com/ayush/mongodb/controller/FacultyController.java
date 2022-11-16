package com.ayush.mongodb.controller;

import com.ayush.mongodb.model.Faculty;
import com.ayush.mongodb.repo.FacultyMongoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    private final FacultyMongoRepo facultyMongoRepo;

    @GetMapping
    public ResponseEntity createFaculty(){
        facultyMongoRepo.save(Faculty.builder().name("BCA").build());
        facultyMongoRepo.save(Faculty.builder().name("CSIT").build());
        facultyMongoRepo.save(Faculty.builder().name("BIM").build());
        return ResponseEntity.ok("Faculty Created");
    }
}
