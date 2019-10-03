package com.ics.students.repositories;

import com.ics.students.models.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {
    List<University> findByName(String name);

    List<University> findByNameContaining(String name);

    List<University> findByYearFoundedGreaterThan(String yearFound);

    List<University> findByStudentId(Long id);

    List<University> findByNameAndLocation(String name, String location);
}
