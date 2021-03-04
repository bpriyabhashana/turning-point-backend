package com.api.turningpoint;

import com.api.turningpoint.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class TurningPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurningPointApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Buddhika",
						"bpriyabhashana@gmail.com",
						LocalDate.of(2000, 12, 2),
						18

				)
		);
	}

}
