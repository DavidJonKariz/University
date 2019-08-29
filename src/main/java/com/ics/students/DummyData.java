package com.ics.students;

import com.ics.students.models.Student;
import com.ics.students.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student david = new Student("David", "Kariuki", "Mwangi", "18/10/1997");
        studentRepository.save(david);
        Student nicollet = new Student("Nicollet", "Njora", "Hungi", "6/6/1998");
        studentRepository.save(nicollet);
    }
}
