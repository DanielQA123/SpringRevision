package com.qa.persistance.dtos;

import java.util.List;

public class DistrictDTO {
	
	private Long id;
	private String schoolName;
	private String postcode;
	private Integer capacity;
	
	private List<SchoolDTO> schoolList;
	
	public DistrictDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictDTO(Long id, String schoolName, String postcode, Integer capacity, List<SchoolDTO> schoolList) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.postcode = postcode;
		this.capacity = capacity;
		this.schoolList = schoolList;
	}

	public DistrictDTO(String schoolName, String postcode, Integer capacity, List<SchoolDTO> schoolList) {
		super();
		this.schoolName = schoolName;
		this.postcode = postcode;
		this.capacity = capacity;
		this.schoolList = schoolList;
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

	public List<SchoolDTO> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<SchoolDTO> schoolList) {
		this.schoolList = schoolList;
	}
	
	
	
	
	
	

}
