package com.mx.Persona.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PERSONA")
@Data
public class Persona {
	
	@Id
	private int id;
	private String nombre;
	private int edad;

}
