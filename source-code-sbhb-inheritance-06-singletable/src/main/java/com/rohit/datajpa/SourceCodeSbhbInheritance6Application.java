package com.rohit.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohit.datajpa.entity.Student;
import com.rohit.datajpa.entity.Teacher;
import com.rohit.datajpa.repository.StudentRepo;
import com.rohit.datajpa.repository.TeacherRepo;

@SpringBootApplication
public class SourceCodeSbhbInheritance6Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SourceCodeSbhbInheritance6Application.class, args);
	}

	@Autowired
	private StudentRepo studRepo;
	
	@Autowired
	private TeacherRepo teacherRepo;
	
	@Override
	public void run(String... args) throws Exception {

		saveStudent();
		saveTeacher();
	}

	private void saveTeacher() {
		Teacher teacher = new Teacher("john", "ortan", 12000D);
		teacherRepo.save(teacher);
	}

	private void saveStudent() {
		Student student = new Student("rohit", "chavan", "spring boot data jpa");
		studRepo.save(student);
	}

}
