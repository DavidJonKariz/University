package com.ics.university;

import com.ics.university.models.University;
import com.ics.university.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final UniversityRepository universityRepository;

    public DummyData(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("Strathmore", "Ole Sangale");
        strath.setYearFounded("1997");
        universityRepository.save(strath);
        University jkuat = new University("JKUAT", "Juja");
        jkuat.setYearFounded("1934");
        universityRepository.save(jkuat);
    }
}
