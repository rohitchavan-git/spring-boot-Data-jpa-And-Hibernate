package com.rohit.datajpa.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.rohit.datajpa.util.PassStatus;

@Entity
public class Student extends User {

	private String cource;

	@Enumerated(EnumType.STRING)
	private PassStatus passStatus;

	public Student() {
	}

	public Student(String fname, String lname, String cource, PassStatus passStatus) {
		super(fname, lname);
		this.cource = cource;
		this.passStatus = passStatus;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public PassStatus getPassStatus() {
		return passStatus;
	}

	public void setPassStatus(PassStatus passStatus) {
		this.passStatus = passStatus;
	}

}
