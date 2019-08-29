package com.ics.university.controller;

import com.ics.university.models.University;
import com.ics.university.services.UniversityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
