package com.example.SpringBootApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RegisteredStudent")
public class StudentEntity {
    private  String name;
    private  String email;
    private String semester;
    @Id
    private  String id;
    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean active;
    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean hasAcess;

}
