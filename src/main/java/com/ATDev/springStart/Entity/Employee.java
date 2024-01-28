package com.ATDev.springStart.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empID;

    private String empName;

    private String Designation;

    private int Salary;

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return Designation;
    }

    public int getSalary() {
        return Salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDesignation(String designation) {
        this.Designation = designation;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public Long getEmpID() {
        return empID;
    }

    // getters and setters

}
