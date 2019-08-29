package com.ics.university.services;

import com.ics.university.NotFoundException;
import com.ics.university.models.University;
import com.ics.university.repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {
    //field injection
//    @Autowired
//    UniversityRepository universityRepository;

    // constructor injection
    private final UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(Long id) {
        return universityRepository.findById(id).orElseThrow(() ->
                new NotFoundException("No University with ID: " + id + " found."));
    }

    @Override
    public void delete(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University update(University university) {
        University found = findById(university.getId());
        found.setName(university.getName());
        found.setLocation(university.getLocation());
        found.setYearFounded(university.getYearFounded());
        return universityRepository.save(found);
    }

    @Override
    public University update(Long id, University university) {
        University found = findById(id);
        found.setName(university.getName());
        found.setLocation(university.getLocation());
        found.setYearFounded(university.getYearFounded());
        return universityRepository.save(found);
    }
}
