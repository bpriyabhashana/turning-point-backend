package com.api.turningpoint.repository;

import com.api.turningpoint.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional <Student> findStudentByEmail(String email);
}
