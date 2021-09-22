package com.example.SpringBootApplication.Mapper;


import com.example.SpringBootApplication.DTO.StudentDTO;
import com.example.SpringBootApplication.Entity.StudentEntity;

public class StudentMapper {
    public static StudentEntity DtoToStudent(StudentDTO req){
        return new StudentEntity().setName(req.getName()).setEmail(req.getEmail()).setId(req.getId()).setSemester(req.getSemester());
    }

    public static StudentDTO EntityToDto(StudentEntity crs) {
        return new StudentDTO().setName(crs.getName()).setEmail(crs.getEmail()).setId(crs.getId()).setSemester(crs.getSemester());
    }
}
