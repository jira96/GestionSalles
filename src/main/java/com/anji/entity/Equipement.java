package com.anji.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Equipement implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nom;
	private String code;
	@ManyToOne
	@JoinColumn(name = "id_salle")
	private Salle salle;
	
	public Equipement() {
		super();
	}

	public Equipement(Long id, String nom, String code, Salle salle) {
		super();
		this.id = id;
		this.nom = nom;
		this.code = code;
		this.salle = salle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
}
