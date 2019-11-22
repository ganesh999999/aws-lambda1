package com.ttd.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttd.model.Substation;
import com.ttd.serviceImpl.SubstationServiceImpl;

@RestController
@RequestMapping("/substation")
public class SubstationController {
	@Autowired
	private SubstationServiceImpl substationServiceImpl;
    @GetMapping("/getAllSubstations")
	public List<Substation> getAllSubstations() {
		List<Substation> substations = substationServiceImpl.getAllSubstations();
		return substations;
	}
    
    
}
