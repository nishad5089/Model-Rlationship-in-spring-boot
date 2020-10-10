package com.hibarnaterationship.hibarnaterelationship.repository;

import com.hibarnaterationship.hibarnaterelationship.model.StudentInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepository extends CrudRepository<StudentInfo,Integer> {
}
