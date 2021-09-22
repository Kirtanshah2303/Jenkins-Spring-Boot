package com.example.SpringBootApplication.Repository;

import com.example.SpringBootApplication.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,String> {

}
