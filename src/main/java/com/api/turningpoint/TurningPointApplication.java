package com.api.turningpoint;

import com.api.turningpoint.repository.StudentsRepository;
import com.api.turningpoint.student.Student;
import com.api.turningpoint.student.Students;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class TurningPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurningPointApplication.class, args);
	}


	CommandLineRunner commandLineRunner(StudentsRepository studentsRepository){
		return args -> {
			Students maria = new Students(
					"Maria",
					"Jones",
					"maria@gmail.com",
					16
			);
			studentsRepository.save(maria);
		};
	}

}
