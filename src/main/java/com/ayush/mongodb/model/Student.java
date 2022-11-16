package com.ayush.mongodb.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("student")
public class Student {

    @Id
    private String id;

    private String name;

    @DocumentReference
    private Faculty faculty;
}
