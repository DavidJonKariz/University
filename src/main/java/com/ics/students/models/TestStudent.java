package com.ics.students.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "test_student")
public class TestStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull(groups = Student.Update.class)
    @Column(name = "id")
    private Long id;

    @NotNull(groups = Student.Create.class)
    @Column(name = "student_number")
    private String student_number;

    @Column(name = "first_name")
    private String first_name;

    public TestStudent(@NotNull(groups = Student.Create.class) String student_number, String first_name) {
        this.student_number = student_number;
        this.first_name = first_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
