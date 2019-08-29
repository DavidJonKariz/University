package com.ics.university.services;

import com.ics.university.models.University;

import java.util.List;

public interface UniversityService {
    List<University> findAll();
    University findById(Long id);
    void delete(Long id);
    University createUniversity(University university);
    University update(University university);
    University update(Long id, University university);
}
