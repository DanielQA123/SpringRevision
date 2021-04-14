package com.qa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.DistrictService;

@RestController
@RequestMapping("/district")
public class DistrictController {
	
	private DistrictService service;
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello world";
	}
	
	//=======
	//GET:
	//=======
	
	//=======
	//POST:
	//=======
	
	//=======
	//PUT:
	//=======
	
	//=======
	//DELETE:
	//=======
	
	

}
