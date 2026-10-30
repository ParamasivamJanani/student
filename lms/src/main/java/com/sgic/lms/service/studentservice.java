package com.sgic.lms.service;

import com.sgic.lms.entity.Student;
import com.sgic.lms.repository.studentRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Id
@Service
@RequiredArgsConstructor
public class studentservice {
    private final studentRepository repository;

    public Student saveStudent(Student Student){
        return repository.save(Student);
    }
    public List<Student> getAllStudent(){
        return  repository.findAll();
    }
    public Student getStudentById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Student updateStudent(Long id){
        return repository.(Student);

}
