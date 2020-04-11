package com.rohit.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.User;
import com.rohit.datajpa.repository.UserRepo;

@SpringBootApplication
public class SourceCodeSbhbCompositekey11Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCompositekey11Application.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("rohit", "chavan", "rohitchavan@gmail.com");
		userRepo.save(user);
	}

}
