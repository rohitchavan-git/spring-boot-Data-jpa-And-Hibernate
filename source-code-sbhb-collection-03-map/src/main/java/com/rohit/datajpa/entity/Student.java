package com.rohit.datajpa.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
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

	@ElementCollection
	@CollectionTable(name = "photos",  
	joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
	@MapKeyColumn(name="photo_name")
	@Column(name="photo_discribe")
	private Map<String,String> photos = new HashMap<>();

	public Student() {
	}

	public Student(String fname, String lname, Map<String,String> photos) {
		this.fname = fname;
		this.lname = lname;
		this.photos = photos;
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

	public Map<String,String> getPhotos() {
		return photos;
	}

	public void setPhotos(Map<String,String> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", photos=" + photos + "]";
	}
}
