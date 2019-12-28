package com.anji.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.anji.entity.Salle;
import com.anji.service.SalleService;

@RestController
public class SalleController {

	@Autowired
	private SalleService salleService;
	
	@GetMapping("/salles")
	public List<Salle> getAllSalles() {
		return salleService.getAllSalles();
	}
	
	@GetMapping("/salles/findByCode/{code}")
	public Salle getSalleByCode(@PathVariable("code") String code) {
		return salleService.getSalleByCode(code);
	}
	
	@PostMapping("/salles/add")
	public Salle addOrUpdateSalle(@Valid @RequestBody Salle salle) {
		return salleService.addOrUpdateSalle(salle);
	}
	
	@DeleteMapping("/salles/delete/{Id}")
	public void deleteSalle(@PathVariable("Id") Long id) {
		salleService.deleteSalle(id);
	}
}
