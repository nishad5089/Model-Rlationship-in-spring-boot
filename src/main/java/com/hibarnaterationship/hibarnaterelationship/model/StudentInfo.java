package com.hibarnaterationship.hibarnaterelationship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name="student_info")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.PRIVATE)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    private int grade;

    private int semester;
    @OneToOne(mappedBy = "studetntInfo")
    @JsonIgnore
    private Student student;
}
