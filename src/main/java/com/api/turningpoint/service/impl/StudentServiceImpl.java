package com.api.turningpoint.service.impl;

import com.api.turningpoint.repository.StudentRepository;
import com.api.turningpoint.service.StudentService;
import com.api.turningpoint.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {

        return studentRepository.findAll();
//        return List.of(
//                new Student(
//                        1L,
//                        "Buddhika",
//                        "bpriyabhashana@gmail.com",
//                        LocalDate.of(2000, 12, 2),
//                        18
//
//                )
//        );
    }
}
