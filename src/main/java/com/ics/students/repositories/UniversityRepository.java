package com.ics.students.repositories;

import com.ics.students.models.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {
//    List<University> findByName(String name)
}
