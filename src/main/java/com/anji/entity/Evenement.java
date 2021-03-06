package com.anji.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;

@Entity
public class Evenement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String titre;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;
	private boolean isValid;
	
	public Evenement() {
		super();
	}

	public Evenement(Long id, String titre, Date date, boolean isValid) {
		super();
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.isValid = isValid;
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

	@JsonDeserialize(using = DateDeserializer.class)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


}
