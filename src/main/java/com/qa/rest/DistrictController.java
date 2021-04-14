package com.qa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistance.domain.DistrictDomain;
import com.qa.persistance.dtos.DistrictDTO;
import com.qa.service.DistrictService;

@RestController
@RequestMapping("/district")
public class DistrictController {
	
	private DistrictService service;
	
	@Autowired
	public DistrictController(DistrictService service) {
		super();
		this.service = service;
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello world";
	}
	
	//=======
	//GET:
	//=======
	
	//READ ALL:
	
	@GetMapping("/readAll")
	public ResponseEntity<List<DistrictDTO>> readAll(){
		return new ResponseEntity<List<DistrictDTO>>(this.service.readAll(), HttpStatus.ACCEPTED);
	}
	
	//READ BY ID:
	
	
	//=======
	//POST:
	//=======
	
	@PostMapping("/create")
	public ResponseEntity<DistrictDTO> create(@RequestBody DistrictDomain model){
		return new ResponseEntity<DistrictDTO>(this.service.create(model), HttpStatus.CREATED);
	}
	
	//=======
	//PUT:
	//=======
	
	//=======
	//DELETE:
	//=======
	
	

}
