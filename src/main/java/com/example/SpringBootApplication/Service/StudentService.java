package com.example.SpringBootApplication.Service;

import com.example.SpringBootApplication.Entity.StudentEntity;
import com.example.SpringBootApplication.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public StudentEntity save(StudentEntity req) {
        return studentRepo.save(req);
    }

    @Override
    public void delete(String id) {
        studentRepo.deleteById(id);
    }
}
