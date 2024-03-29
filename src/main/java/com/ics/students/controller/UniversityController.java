package com.ics.students.controller;

import com.ics.students.models.Student;
import com.ics.students.models.University;
import com.ics.students.services.UniversityService;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities", produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public List<University> findAll() {
        return universityService.findAll();
    }

    @GetMapping(value = "{id}")
    public University findById(@PathVariable Long id) {
        return universityService.findById(id);
    }

    @PostMapping
    University createUniversity(@Validated(University.Create.class)@RequestBody University university) {
        return universityService.createUniversity(university);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id) {
        universityService.delete(id);
    }

    @PatchMapping
    public University updateUniversity(@Validated(University.Update.class)@RequestBody University university) {
        return universityService.update(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@Validated(University.Update.class)@PathVariable Long id, @RequestBody University university) {
        return universityService.update(id, university);
    }

    //Student
    @PostMapping(value = "{id}/students")
    public Student createStudent(@PathVariable Long id, @RequestBody Student student) {
        return universityService.createStudent(id, student);
    }

}
