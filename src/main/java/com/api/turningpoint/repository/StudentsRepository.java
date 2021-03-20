package com.api.turningpoint.repository;

import com.api.turningpoint.student.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}
