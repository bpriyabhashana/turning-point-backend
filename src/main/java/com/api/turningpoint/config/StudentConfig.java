package com.api.turningpoint.config;

import com.api.turningpoint.repository.StudentRepository;
import com.api.turningpoint.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student Buddhika =  new Student(
                    "Buddhika",
                    "bpriyabhashana@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 2)

                );

           Student Rex =  new Student(
                    "Rex",
                    "rex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 2)

            );

           repository.saveAll(List.of(Buddhika, Rex));
        };
    }
}
