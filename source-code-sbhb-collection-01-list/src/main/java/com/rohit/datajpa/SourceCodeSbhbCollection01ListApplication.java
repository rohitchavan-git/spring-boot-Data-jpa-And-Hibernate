package com.rohit.datajpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.Student;
import com.rohit.datajpa.repository.StudentRepo;

@SpringBootApplication
public class SourceCodeSbhbCollection01ListApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCollection01ListApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		ArrayList<String> picList = new ArrayList<>();
		picList.add("photo1.jpg");
		picList.add("photo2.jpg");
		picList.add("photo3.jpg");
		picList.add("photo3.jpg");
		Student student = new Student("rohit", "chavan", picList);
		studentRepo.save(student);
	}

}
