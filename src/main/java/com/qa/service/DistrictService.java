package com.qa.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistance.repos.DistrictRepo;

@Service
public class DistrictService {
	
	private DistrictRepo repo;
	private ModelMapper mapper;
	
	@Autowired
	public DistrictService(DistrictRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	
	

}
