package com.qa.persistance.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class DistrictDomain {
	
	//Attributes: 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String schoolName;
	private String postcode;
	private Integer capacity;
	
	@OneToMany(mappedBy = "theSchool", fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<SchoolDomain> schoolList;
	
	public DistrictDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictDomain(Long id, String schoolName, String postcode, Integer capacity,
			List<SchoolDomain> districtList) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.postcode = postcode;
		this.capacity = capacity;
		this.schoolList = schoolList;
	}

	public DistrictDomain(String schoolName, String postcode, Integer capacity,
			List<SchoolDomain> districtList) {
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

	public List<SchoolDomain> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<SchoolDomain> schoolList) {
		this.schoolList = schoolList;
	}

	@Override
	public String toString() {
		return "DistrictDomain [id=" + id + ", schoolName=" + schoolName + ", postcode=" + postcode + ", capacity="
				+ capacity + ", schoolList=" + schoolList + "]";
	}
	
	
	
	

	
	
}
