package com.rohit.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.IdCustom;
import com.rohit.datajpa.entity.User;
import com.rohit.datajpa.repository.UserRepo;

@SpringBootApplication
public class SourceCodeSbhbCompositekey12Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbCompositekey12Application.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		IdCustom id = new IdCustom("rohitchavan@gmail.com", "rohit");
		User user = new User(id, "chavan");
		userRepo.save(user);
	}

}
