package com.rohit.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.datajpa.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
