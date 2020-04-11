package com.rohit.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private String state;
	@Column(name = "pincode")
	private String pinCode;

	public Address() {
	}

	public Address(String city, String state, String pinCode) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}
