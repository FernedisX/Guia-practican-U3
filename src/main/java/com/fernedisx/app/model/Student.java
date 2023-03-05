package com.fernedisx.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "cliente")
public class Student {
    private String id;
    private String name;
    private Long studentNumber;
    private String email;
    private List<String> courseList;
    private Float gpa;

}
