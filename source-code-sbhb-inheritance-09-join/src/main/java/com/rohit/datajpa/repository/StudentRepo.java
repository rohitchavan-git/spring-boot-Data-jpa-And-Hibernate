package com.rohit.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.datajpa.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
