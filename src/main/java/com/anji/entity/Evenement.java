package com.anji.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.*;

@Entity
public class Evenement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String titre;
	private ZonedDateTime date;
	private boolean isValid;
	@OneToOne
	@JoinColumn(name = "id_evenement", referencedColumnName = "id")
	private Reservation reservation;
	
	public Evenement() {
		super();
	}

	public Evenement(Long id, String titre, ZonedDateTime date, boolean isValid, Reservation reservation) {
		super();
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.isValid = isValid;
		this.reservation = reservation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public ZonedDateTime getDate() {
		return date;
	}

	public void setDate(ZonedDateTime date) {
		this.date = date;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
}
