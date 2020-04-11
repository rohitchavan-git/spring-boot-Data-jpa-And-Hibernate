package com.rohit.datajpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User {

	private String cource;

	public Student() {
	}

	public Student(String fname, String lname, String cource) {
		super(fname, lname);
		this.cource = cource;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

}
