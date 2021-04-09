package com.qa.persistance.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SchoolDomain {
	
	//Attributes: 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String favSubject;
	private Integer age;
	
	//Generating Constructors:
	
	public SchoolDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolDomain(Long id, String name, String email, String favSubject, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.favSubject = favSubject;
		this.age = age;
	}

	public SchoolDomain(String name, String email, String favSubject, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.favSubject = favSubject;
		this.age = age;
	}
	
	//Generating getters and setters: 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavSubject() {
		return favSubject;
	}

	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SchoolDomain [id=" + id + ", name=" + name + ", email=" + email + ", favSubject=" + favSubject
				+ ", age=" + age + "]";
	}
	
	
	
	
	
	
	

	
}
