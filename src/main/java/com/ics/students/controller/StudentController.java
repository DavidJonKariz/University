package com.ics.students.controller;

import com.ics.students.models.Student;
import com.ics.students.services.StudentService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students", produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping(value = "{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    Student createStudent(@Validated(Student.Create.class)@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping(value = "{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PatchMapping
    public Student updateStudent(@Validated(Student.Update.class)@RequestBody Student student) {
        return studentService.update(student);
    }

    @PatchMapping(value = "{id}")
    public Student updateStudent(@Validated(Student.Update.class)@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }
}
