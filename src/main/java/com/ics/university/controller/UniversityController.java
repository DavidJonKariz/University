package com.ics.university.controller;

import com.ics.university.models.University;
import com.ics.university.services.UniversityService;
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
    University createUniversity(@RequestBody University university) {
        return universityService.createUniversity(university);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id) {
        universityService.delete(id);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@PathVariable Long id, @RequestBody University university) {
        return universityService.update(id, university);
    }
}
