package com.rohit.datajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.Student;
import com.rohit.datajpa.repository.StudentRepo;

@SpringBootApplication
public class SourceCodeSbhbCollection02Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCollection02Application.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		Set<String> picList = new HashSet<>();
		picList.add("photo1.jpg");
		picList.add("photo2.jpg");
		picList.add("photo3.jpg");
		picList.add("photo3.jpg"); // duplicates are not allowed.
		Student student = new Student("rohit", "chavan", picList);
		studentRepo.save(student);
	}

}
