package com.ics.students;

import com.ics.students.models.Course;
import com.ics.students.models.Student;
import com.ics.students.models.University;
import com.ics.students.repositories.CourseRepository;
import com.ics.students.repositories.StudentRepository;
import com.ics.students.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;

    public DummyData(CourseRepository courseRepository, StudentRepository studentRepository,
                     UniversityRepository universityRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Universities
        University strath = new University("Strathmore", "Ole Sangale");
        strath.setYearFounded("1997");
        universityRepository.save(strath);
        University jkuat = new University("JKUAT", "Juja");
        jkuat.setYearFounded("1934");
        universityRepository.save(jkuat);

//        Courses
        Course course = new Course("Application Programming for the Internet");
//        courseRepository.save(course);
        Course course_un = new Course("Distributed Objects and Web Services");
        courseRepository.save(course_un);

//        Students
        Student david = new Student("David", "Kariuki", "Mwangi", "18/10/1997", strath);
        studentRepository.save(david);
        Student nicollet = new Student("Nicollet", "Njora", "Hungi", "6/6/1998", strath);
        studentRepository.save(nicollet);
        Student trevor = new Student("Trevor", "", "Mukwaya", "5/1/1997", strath);
        studentRepository.save(trevor);

        course.addStudent(trevor);
//        course_un.addStudent(david);
        courseRepository.save(course);
//        courseRepository.save(course_un);
    }
}
