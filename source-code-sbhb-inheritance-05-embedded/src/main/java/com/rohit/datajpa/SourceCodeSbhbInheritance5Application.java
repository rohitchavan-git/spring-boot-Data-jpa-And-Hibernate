package com.rohit.datajpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import com.rohit.datajpa.entity.Address;
import com.rohit.datajpa.entity.Student;				
import com.rohit.datajpa.repository.StudentRepo;

@SpringBootApplication
public class SourceCodeSbhbInheritance5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbInheritance5Application.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Address homeAddress = new Address("osmanabad", "Maharastra", "413501");
		Address billingAddress = new Address("hyderabad", "Telangana" , "	500004");
		Student student = new Student("rohit", "chavan", homeAddress, billingAddress);
		studentRepo.save(student);
		findStudentById();
	}

	private void findStudentById() {
		Optional<Student> dbStudent = studentRepo.findById(1L);
		Assert.isTrue(dbStudent.get().getFname().equals("rohit"), "something wrong buddy!!");
	}

}
