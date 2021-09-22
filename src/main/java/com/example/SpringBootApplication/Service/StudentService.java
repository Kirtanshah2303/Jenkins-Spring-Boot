package com.example.SpringBootApplication.Service;

import com.example.SpringBootApplication.Entity.StudentEntity;
import com.example.SpringBootApplication.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentService implements StudentInterface{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentByID(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public String save(StudentEntity req) {
        return "Student Registered Succesfully";
    }

    @Override
    public String delete(String id) {
        return "Student Deleted.!";
    }
}
