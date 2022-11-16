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
@Document("faculty")
public class Faculty {
    @Id
    private String id;

    private String name;

    @DocumentReference(lazy = true, lookup = "{'faculty' : ?#{#self._id}}")
    @ReadOnlyProperty
    private Student student;
}
