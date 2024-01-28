package com.ATDev.springStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ATDev.springStart.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
