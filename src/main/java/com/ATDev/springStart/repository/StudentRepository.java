package com.ATDev.springStart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ATDev.springStart.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
