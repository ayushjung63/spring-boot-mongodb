package com.ayush.mongodb.pojo;

import com.ayush.mongodb.model.Faculty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentPojo {

    private String name;

    private String facultyId;

    private String faculty;
}
