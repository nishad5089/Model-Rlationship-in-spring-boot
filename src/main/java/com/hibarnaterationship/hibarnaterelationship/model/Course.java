package com.hibarnaterationship.hibarnaterelationship.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.PRIVATE)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(name = "course_name")
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
