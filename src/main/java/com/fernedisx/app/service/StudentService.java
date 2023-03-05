package com.fernedisx.app.service;

import com.fernedisx.app.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findByStudentNumber(Long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

    void saveOrUpdateStudent(Student student);

    void deleteStudent(String id);

}
