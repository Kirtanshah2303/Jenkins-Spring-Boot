package com.example.SpringBootApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@Accessors(chain = true)
//@EntityListeners(AuditingEntityListener.class)
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
