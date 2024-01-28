package com.ATDev.springStart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ATDev.springStart.Entity.Student;
import com.ATDev.springStart.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // GET all students

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // GET Student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // POST create a new Student
    @PostMapping
    public Student createStudent(@RequestBody Student Student) {
        return studentRepository.save(Student);
    }

    // PUT update a Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent != null) {
            existingStudent.setStudentName(updatedStudent.getStudentName());
            existingStudent.setGrade(updatedStudent.getGrade());
            existingStudent.setAge(updatedStudent.getAge());

            return studentRepository.save(existingStudent);
        }

        return null;
    }

    // DELETE Student by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
