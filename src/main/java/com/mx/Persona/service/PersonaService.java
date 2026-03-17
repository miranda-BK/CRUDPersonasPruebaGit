package com.mx.Persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Persona.dao.IPersonaDao;
import com.mx.Persona.dominio.Persona;

@Service
public class PersonaService {

	@Autowired
	private IPersonaDao dao;
	
	public Persona guardar(Persona p) {
		return dao.save(p);
	}
	
	public List<Persona> listar(){
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
}
