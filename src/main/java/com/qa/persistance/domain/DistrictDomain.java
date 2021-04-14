package com.qa.persistance.domain;

import javax.persistence.Entity;

@Entity
public class DistrictDomain {
	
	//Attributes: 
	private Long id;
	private String schoolName;
	private String postcode;
	private Integer capacity;
	
	public DistrictDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictDomain(Long id, String schoolName, String postcode, Integer capacity) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.postcode = postcode;
		this.capacity = capacity;
	}

	public DistrictDomain(String schoolName, String postcode, Integer capacity) {
		super();
		this.schoolName = schoolName;
		this.postcode = postcode;
		this.capacity = capacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "DistrictDomain [id=" + id + ", schoolName=" + schoolName + ", postcode=" + postcode + ", capacity="
				+ capacity + "]";
	}
	
	
	
}
