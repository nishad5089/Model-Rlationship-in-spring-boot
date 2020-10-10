package com.hibarnaterationship.hibarnaterelationship;

import com.hibarnaterationship.hibarnaterelationship.model.Course;
import com.hibarnaterationship.hibarnaterelationship.model.Department;
import com.hibarnaterationship.hibarnaterelationship.model.Student;
import com.hibarnaterationship.hibarnaterelationship.model.StudentInfo;
import com.hibarnaterationship.hibarnaterelationship.repository.CourseRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.DepartmentRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentInfoRepository;
import com.hibarnaterationship.hibarnaterelationship.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HibarnaterelationshipApplication implements CommandLineRunner {
    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;
    private final DepartmentRepository departmentRepo;
    private final StudentInfoRepository studentInfoRepo;
    public static void main(String[] args) {
        SpringApplication.run(HibarnaterelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hellow world");
        Department department = new Department();
        department.setName("CSE");
        department.setHead("ASIF vai");
        departmentRepo.save(department);
        System.out.println("--saved--");
        Course course1 = new Course("Bangla");
        courseRepo.save(course1);
        Course course2 = new Course("English");
        courseRepo.save(course2);
        Set<Course> courses  = new HashSet<>();
        courses.add(course1);
        courses.add(course2);

        StudentInfo studentInfo =  new StudentInfo();
        studentInfo.setGrade(4);
        studentInfo.setSemester(3);

        Student student1 = new Student();
        student1.setStudentName("nishad");
        student1.setStudetntInfo(studentInfo);
        student1.setDepartment(department);
        student1.setCourses(courses);
        studentRepo.save(student1);
    }
}
