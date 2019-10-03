package com.ics.students;

import com.ics.students.models.Student;
import com.ics.students.models.TestStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="client", url="10.51.11.230:1000")
public interface StudentFeignRestClient {
//    @RequestMapping(method = RequestMethod.GET, value = "students")
//    TestStudent getStudent(@RequestParam(name = "studentNumber")String studentNumber);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
//    TestStudent findStudentById(@PathVariable(name="id")Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value = "students")
//    TestStudent createStudent(@RequestBody String studentNumber, String firstName);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students/search")
//    TestStudent searchByName(@RequestParam(name = "name")String name);
}
