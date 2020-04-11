package com.rohit.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private IdCustom id;
	@Column(name = "last_name")
	private String lname;

	public User() {
	}

	public User(IdCustom id, String lname) {
		this.setId(id);
		this.lname = lname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public IdCustom getId() {
		return id;
	}

	public void setId(IdCustom id) {
		this.id = id;
	}
}
