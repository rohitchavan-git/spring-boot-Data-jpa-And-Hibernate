package com.rohit.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.datajpa.entity.IdCustom;
import com.rohit.datajpa.entity.User;

public interface UserRepo extends JpaRepository<User, IdCustom> {

}
