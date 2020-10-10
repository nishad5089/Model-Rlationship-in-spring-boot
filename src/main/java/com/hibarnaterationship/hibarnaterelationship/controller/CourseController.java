package com.hibarnaterationship.hibarnaterelationship.controller;

import com.hibarnaterationship.hibarnaterelationship.model.Course;
import com.hibarnaterationship.hibarnaterelationship.model.Student;
import com.hibarnaterationship.hibarnaterelationship.repository.CourseRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController("")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
    private final CourseRepository courseRepo;

    @GetMapping("getAllCourses")
    public List<Course> getAllCourses() {
        return (List<Course>) this.courseRepo.findAll();
    }
}
