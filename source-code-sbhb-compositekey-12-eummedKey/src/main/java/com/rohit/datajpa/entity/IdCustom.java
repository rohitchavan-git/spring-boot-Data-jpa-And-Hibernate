package com.rohit.datajpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdCustom implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "email")
	private String email;
	@Column(name = "first_name")
	private String fname;

	public IdCustom() {
	}

	public IdCustom(String email, String fname) {
		this.email = email;
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}
