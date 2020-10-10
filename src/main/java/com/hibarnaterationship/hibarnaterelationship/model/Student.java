package com.hibarnaterationship.hibarnaterelationship.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.PRIVATE)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(name = "student_name")
    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_info_id",referencedColumnName = "id")
    @NotNull
    private StudentInfo studetntInfo;

    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Department department;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH
            })
    @JoinTable(name = "sts_student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    @JsonIgnore
    private Set<Course> courses  = new HashSet<>();
}
