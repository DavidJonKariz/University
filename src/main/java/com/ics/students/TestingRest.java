package com.ics.students;

import com.ics.students.models.Student;
import com.ics.students.models.TestStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {

    private final UniversityFeignRestClient universityFeignRestClient;
    private final StudentFeignRestClient studentFeignRestClient;

    public TestingRest(UniversityFeignRestClient universityFeignRestClient, StudentFeignRestClient studentFeignRestClient) {
        this.universityFeignRestClient = universityFeignRestClient;
        this.studentFeignRestClient = studentFeignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

//        Universities
//        List<University> universities;// = response.getBody();
//
//        universities = universityFeignRestClient.getAllUniversities();
//        System.out.println("Feign Universities: " + universities.toString());
//
//        University universityTest = universityFeignRestClient.createUniversity(new University("Nairobi University", "CBD"));
//        System.out.println("Created University: " + universityTest.toString());
//        universityTest.setYearFounded("1956");
//        University updatedUniversity = universityFeignRestClient.updateUniversity(universityTest.getId(), universityTest);
//        System.out.println("Updated University: " + updatedUniversity.toString());

//        Students
//        TestStudent studentTest = studentFeignRestClient.createStudent("91937", "Daivd");
//        System.out.println("Created Student: " + studentTest.toString());

//        Student student = studentFeignRestClient.getStudent(studentTest.getId());
//        System.out.println("The Student: " + student.toString());

    }
}
