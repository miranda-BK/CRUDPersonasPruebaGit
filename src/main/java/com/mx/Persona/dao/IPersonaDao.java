package com.mx.Persona.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Persona.dominio.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Integer>{

}
