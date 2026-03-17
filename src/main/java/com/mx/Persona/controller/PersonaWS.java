package com.mx.Persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Persona.dominio.Persona;
import com.mx.Persona.service.PersonaService;

@RestController
@RequestMapping("persona")
public class PersonaWS {
	
	@Autowired
	private PersonaService service;
	
	@GetMapping
	public List<Persona> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Persona guardar(@RequestBody Persona p) {
		return service.guardar(p);
	}

}
