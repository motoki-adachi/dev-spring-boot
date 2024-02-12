package com.luv2code.springrestdemo.rest;

import com.luv2code.springrestdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("John", "Doe"));
        theStudents.add(new Student("Paul", "Kie"));
        theStudents.add(new Student("Mario", "Rossi"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }
}
