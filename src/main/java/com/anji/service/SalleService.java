package com.anji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anji.entity.Salle;
import com.anji.repository.SalleRepository;

@Service
public class SalleService {
	
	@Autowired
	private SalleRepository salleRepos;
	
	public List<Salle> getAllSalles() {
		return salleRepos.findAll();
	}
	
	public Salle getSalleByCode(String code) {
		return salleRepos.findByCode(code);
	}
	
	public Salle addOrUpdateSalle(Salle salle) {
		return salleRepos.save(salle);
	}
	
	public void deleteSalle(Long id) {
		salleRepos.deleteById(id);
	}
	
}
