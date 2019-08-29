package com.ics.university.controller;

import com.ics.university.models.University;
import com.ics.university.services.UniversityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities")
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
}
