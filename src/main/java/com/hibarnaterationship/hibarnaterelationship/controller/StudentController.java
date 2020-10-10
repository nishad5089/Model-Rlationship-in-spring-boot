package com.hibarnaterationship.hibarnaterelationship.controller;

import com.hibarnaterationship.hibarnaterelationship.model.Student;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentInfoRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {
    private final StudentRepository studentRepo;

    @GetMapping("getAllStudent")
    public List<Student> getAllStudent() {
        return (List<Student>) this.studentRepo.findAll();
    }
}
