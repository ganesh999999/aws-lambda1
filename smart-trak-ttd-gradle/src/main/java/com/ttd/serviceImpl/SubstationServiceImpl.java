package com.ttd.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttd.model.Substation;
import com.ttd.repository.SubstationRepository;

@Service
public class SubstationServiceImpl {
	@Autowired
	private SubstationRepository substationRepository;

	public List<Substation> getAllSubstations() {
		List<Substation> substations = substationRepository.findAll();
		return substations;
	}
}
