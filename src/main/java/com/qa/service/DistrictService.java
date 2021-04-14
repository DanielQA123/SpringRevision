package com.qa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistance.domain.DistrictDomain;
import com.qa.persistance.dtos.DistrictDTO;
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
	
	private DistrictDTO mapToDTO(DistrictDomain model) {
		return this.mapper.map(model, DistrictDTO.class);
	}
	
	//=======
	//GET:
	//=======
	
	//READ ALL:
	
	public List<DistrictDTO> readAll(){
		List<DistrictDomain> districtList = this.repo.findAll();
		List<DistrictDTO> districtListDTO = districtList.stream().map(this::mapToDTO).collect(Collectors.toList());
		return districtListDTO;
	}
	
	
	
	//=======
	//POST:
	//=======
	
	public DistrictDTO create(DistrictDomain district) {
		return this.mapToDTO(this.repo.save(district));
	}
	
	//=======
	//PUT:
	//=======
	
	//=======
	//DELETE:
	//=======
	
	
	

}
