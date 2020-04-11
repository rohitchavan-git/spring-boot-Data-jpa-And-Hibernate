package com.rohit.datajpa;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import com.rohit.datajpa.entity.Student;
import com.rohit.datajpa.repository.StudentRepo;

@SpringBootApplication
public class SourceCodeSbhbCollection03Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCollection03Application.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
	
		Map<String,String> picList=new HashMap<>();
		picList.put("photo1.jpg", "collage trip");
		picList.put("photo2.jpg", "1st movie in PVR.");
		picList.put("photo3.jpg", "1st day  of  office.");
		Student student = new Student("rohit", "chavan", picList);
		Student save = studentRepo.save(student);
		
		Assert.isTrue(save.getPhotos().get("photo1.jpg").contains("trip"), "Something wrong buddy !!");
	}

}
