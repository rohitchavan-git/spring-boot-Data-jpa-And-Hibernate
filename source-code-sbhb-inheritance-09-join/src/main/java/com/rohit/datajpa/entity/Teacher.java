package com.rohit.datajpa.entity;

import javax.persistence.Entity;

@Entity
public class Teacher extends User {

	private Double salary;

	public Teacher() {

	}
	public Teacher(String fname, String lname, Double salary) {
		super(fname, lname);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
