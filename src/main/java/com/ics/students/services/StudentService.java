package com.ics.students.services;

import com.ics.students.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    void delete(Long id);
    Student createUniversity(Student student);
    Student update(Student student);
    Student update(Long id, Student student);
}
