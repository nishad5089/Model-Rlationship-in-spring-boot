package com.hibarnaterationship.hibarnaterelationship.repository;

import com.hibarnaterationship.hibarnaterelationship.model.Department;
import com.hibarnaterationship.hibarnaterelationship.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}