package com.hibarnaterationship.hibarnaterelationship.controller;

import com.hibarnaterationship.hibarnaterelationship.model.Department;
import com.hibarnaterationship.hibarnaterelationship.model.Student;
import com.hibarnaterationship.hibarnaterelationship.repository.DepartmentRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.List;
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DepartmentController {
    private final DepartmentRepository departmentRepo;

    @GetMapping("getAllDepartment")
    public List<Department> getAllStudent() {
        return (List<Department>) this.departmentRepo.findAll();
    }
}
