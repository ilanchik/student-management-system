package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);

}
