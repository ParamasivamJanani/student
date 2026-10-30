package com.sgic.lms.controller;


import com.sgic.lms.entity.Student;
import com.sgic.lms.service.studentservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Student")

public class api {
    private final studentservice service;

    @PostMapping
    public Student addStudent(@RequestBody Student Student) {
        return service.saveStudent(Student);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }
    @GetMapping("/id")
    public Student getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }
    @PutMapping("/id")
    public Student UpdateStudent(@PathVariable Long id, @RequestBody Student Student){
        return service.updateStudent(id,Student);
    }

}
