package com.ATDev.springStart.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    private String Grade;

    private int Age;

    public String getStudentName() {
        return studentName;
    }

    public String getGrade() {
        return Grade;
    }

    public int getAge() {
        return Age;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(String grade) {
        this.Grade = grade;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public Long getId() {
        return id;
    }

    // getters and setters

}
