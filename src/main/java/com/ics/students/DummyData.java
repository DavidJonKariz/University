package com.ics.students;

import com.ics.students.models.Student;
import com.ics.students.models.University;
import com.ics.students.repositories.StudentRepository;
import com.ics.students.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;

    public DummyData(StudentRepository studentRepository, UniversityRepository universityRepository) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student david = new Student("David", "Kariuki", "Mwangi", "18/10/1997");
        studentRepository.save(david);
        Student nicollet = new Student("Nicollet", "Njora", "Hungi", "6/6/1998");
        studentRepository.save(nicollet);

        University strath = new University("Strathmore", "Ole Sangale");
        strath.setYearFounded("1997");
        universityRepository.save(strath);
        University jkuat = new University("JKUAT", "Juja");
        jkuat.setYearFounded("1934");
        universityRepository.save(jkuat);
    }
}
