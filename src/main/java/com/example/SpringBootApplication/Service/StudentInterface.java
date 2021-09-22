package com.example.SpringBootApplication.Service;

import com.example.SpringBootApplication.Entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentInterface  {
    List<StudentEntity> getAllStudents();
    Optional<StudentEntity> findStudentByID(String id);
    StudentEntity save(StudentEntity req);
    void delete(String id);
}
