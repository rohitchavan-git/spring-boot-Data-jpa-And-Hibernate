package com.rohit.datajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.Student;
import com.rohit.datajpa.repository.StudentRepo;

@SpringBootApplication
public class SourceCodeSbhbCollection04Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCollection04Application.class, args);
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
		findStudentById();
	}

	private void findStudentById() {
		Optional<Student> dbStudent = studentRepo.findById(1L);
		dbStudent.ifPresent(System.out::println);
	}

}
