package com.qa.persistance.dtos;

public class SchoolDTO {
	
	private Long id;
	private String name;
	private String email;
	private String favSubject;
	private Integer age;
	
	public SchoolDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolDTO(Long id, String name, String email, String favSubject, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.favSubject = favSubject;
		this.age = age;
	}

	public SchoolDTO(String name, String email, String favSubject, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.favSubject = favSubject;
		this.age = age;
	}

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
	
	
	

}
