package com.rohit.datajpa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;

	@Embedded // optional Annotation.
	private Address homeAddress;
	
  @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", 
                               column=@Column(name="BILLING_CITY")),
            @AttributeOverride(name="state", 
                               column=@Column(name="BILLING_STATE")),
            @AttributeOverride(name="pinCode", 
            column=@Column(name="BILLING_PINCODE"))
    })
	private Address billingAddress;
	
	public Student() {
	}

	public Student(String fname, String lname, Address homeAddress,Address biilingAddress) {
		this.fname = fname;
		this.lname = lname;
		this.homeAddress = homeAddress;
		this.billingAddress=biilingAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getBiilingAddress() {
		return billingAddress;
	}

	public void setBiilingAddress(Address biilingAddress) {
		this.billingAddress = biilingAddress;
	}

}
