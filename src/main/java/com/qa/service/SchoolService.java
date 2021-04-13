package com.qa.service;

import java.util.List;
import java.util.stream.Collectors;

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
	
//	private SchoolDTO map(SchoolDomain model) {
//		return this.mapper.map(model, SchoolDTO.class);
//	}
// ==> map to MapToDTO because of the stream. 
	
	private SchoolDTO mapToDTO(SchoolDomain model) {
		return this.mapper.map(model, SchoolDTO.class);
	}
	
// =============
// GET: (Need to create a stream)
// ==============
	
//READ ALL:
	
	public List<SchoolDTO> readAll(){
		List<SchoolDomain> dbList = this.repo.findAll();
		List<SchoolDTO> resultList = dbList.stream().map(this::mapToDTO).collect(Collectors.toList());
		return resultList;
	}
	
//READ BY ID:
	
	public SchoolDTO readSchool(Long id) {
		return mapToDTO(this.repo.findById(id).orElseThrow());
	}
	
	
// =============
// POST:
// ==============
	
//! OLD Methods: 
	
//	public SchoolDomain create(SchoolDomain school) {
//		return this.repo.save(school);
//	}
//	=>>>
	
//	public SchoolDTO create(SchoolDomain school) {
//	return this.map(this.repo.save(school));
//  }
	
// POST/CREATE:
	
	public SchoolDTO create(SchoolDomain school) {
		return this.mapToDTO(this.repo.save(school));
	}
	

// =============
// PUT:
// ==============
	
	public SchoolDTO updateSchool(Long id, SchoolDomain newInfo) {
		this.repo.findById(id).orElseThrow();
		
		//The target
		newInfo.setId(id);
		
		return this.mapToDTO(this.repo.save(newInfo));
		
	}
	


// =============
// DELETE:
// ==============
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
	
}
