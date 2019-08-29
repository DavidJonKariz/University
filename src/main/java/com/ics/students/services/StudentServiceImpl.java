package com.ics.students.services;

import com.ics.students.NotFoundException;
import com.ics.students.models.Student;
import com.ics.students.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    // constructor injection
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new NotFoundException("No University with ID: " + id + " found."));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student createUniversity(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Student found = findById(student.getId());
        found.setFirst_name(student.getFirst_name());
        found.setMiddle_name(student.getMiddle_name());
        found.setLast_name(student.getLast_name());
        found.setDate_of_birth(student.getDate_of_birth());
        return studentRepository.save(found);
    }

    @Override
    public Student update(Long id, Student student) {
        Student found = findById(id);
        found.setFirst_name(student.getFirst_name());
        found.setMiddle_name(student.getMiddle_name());
        found.setLast_name(student.getLast_name());
        found.setDate_of_birth(student.getDate_of_birth());
        return studentRepository.save(found);
    }
}
