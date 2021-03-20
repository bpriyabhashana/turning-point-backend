package com.api.turningpoint.service;

import com.api.turningpoint.student.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void addNewStudent(Student student);

    void deleteStudent(Long id);

    void updateStudent(Long studentId, String name, String email);
}
