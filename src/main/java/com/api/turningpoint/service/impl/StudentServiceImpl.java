package com.api.turningpoint.service.impl;

import com.api.turningpoint.repository.StudentRepository;
import com.api.turningpoint.service.StudentService;
import com.api.turningpoint.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public void addNewStudent(Student student) {
       Optional<Student> studentOptional =  studentRepository.findStudentByEmail(student.getEmail());

       if (studentOptional.isPresent()){
           throw new IllegalStateException("Email already exists");
       }
       studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
       boolean exists =  studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("Student with ID " + studentId + "does not exists");

        }
        studentRepository.deleteById(studentId);
    }

    @Override
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {

        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("Student with ID " + studentId + " does not exixts"));
        if(name !=  null && name.length() > 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }
    }
}
