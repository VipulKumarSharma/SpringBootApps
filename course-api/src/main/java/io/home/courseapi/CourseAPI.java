package io.home.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAPI {

	public static void main(String[] args) {
		SpringApplication.run(CourseAPI.class, args);
		
		System.out.println("Course API started.");
	}

}
