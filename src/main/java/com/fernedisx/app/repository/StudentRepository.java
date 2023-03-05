package com.fernedisx.app.repository;

import com.fernedisx.app.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByStudentNumber(Long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

}