package com.qa.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistance.domain.SchoolDomain;
import com.qa.persistance.dtos.SchoolDTO;
import com.qa.persistance.repos.SchoolRepo;

@Service
public class SchoolService {

	private SchoolRepo repo;
	private ModelMapper mapper;

	@Autowired
	public SchoolService(SchoolRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	private SchoolDTO map(SchoolDomain model) {
		return this.mapper.map(model, SchoolDTO.class);
	}
	
//	private SchoolDTO mapToDTO(SchoolDomain model) {
//		return this.mapper.map(model, SchoolDTO.class);
//	}
	
	// =============
	// GET:
	// ==============

	// =============
	// POST:
	// ==============
	
//! OLD Methods: 
	
//	public SchoolDomain create(SchoolDomain school) {
//		return this.repo.save(school);
//	}
//	=>>>
	
	public SchoolDTO create(SchoolDomain school) {
	return this.map(this.repo.save(school));
  }
	
// =>>>>
	
	
//	public SchoolDTO create(SchoolDomain school) {
//		return this.mapToDTO(this.repo.save(school));
//	}
	

	// =============
	// PUT:
	// ==============

	// =============
	// DELETE:
	// ==============


}
