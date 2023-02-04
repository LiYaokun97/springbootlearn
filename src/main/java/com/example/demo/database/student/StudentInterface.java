package com.example.demo.database.student;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentInterface {

    void saveStudent(Student article);

    void deleteStudent(Long id);

    void updateStudent(Student article);

    Student getStudent(Long id);

    List<Student> getAll();
}