package com.anji.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import com.anji.entity.enums.TypeSalle;

@Entity
public class Salle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String code;
	private TypeSalle type;
	@OneToMany(mappedBy = "salle")
	private Collection<Equipement> equipement;
	@ManyToOne
	@JoinColumn(name = "id_reservation")
	private Reservation reservation;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(Long id, String code, TypeSalle type, Collection<Equipement> equipement) {
		super();
		this.id = id; 
		this.code = code;
		this.type = type;
		this.equipement = equipement;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public TypeSalle getType() {
		return type;
	}

	public void setType(TypeSalle type) {
		this.type = type;
	}

	public Collection<Equipement> getEquipement() {
		return equipement;
	}

	public void setEquipement(Collection<Equipement> equipement) {
		this.equipement = equipement;
	}
	
}
