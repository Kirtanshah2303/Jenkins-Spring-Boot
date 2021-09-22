package com.example.SpringBootApplication.Controller;

import com.example.SpringBootApplication.DTO.StudentDTO;
import com.example.SpringBootApplication.Entity.StudentEntity;
import com.example.SpringBootApplication.Mapper.StudentMapper;
import com.example.SpringBootApplication.Service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class MyContoller {

    @Autowired
    StudentInterface studentInterface;

    @GetMapping("/")
    public String Home(){
        return "Hello Friends";
    }
    @GetMapping("/temp")
    public String temp(){
        return "This is for testing of Jenkins";
    }

    @GetMapping("/Students")
    List<StudentEntity> getAll(){
        return studentInterface.getAllStudents();
    }

    @PostMapping("/register")
    String addStudent (@Valid @RequestBody StudentDTO body){
        StudentEntity studentEntity = StudentMapper.DtoToStudent(body);
        StudentEntity add = studentInterface.save(studentEntity);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(add.getId())
//                .toUri();
        return "Entered Success";
    }
    @DeleteMapping("/student/{id}")
    String deleteStudent(@PathVariable("id") String id){

        studentInterface.delete(id);
        return "Removed  " + id;
    }
}
