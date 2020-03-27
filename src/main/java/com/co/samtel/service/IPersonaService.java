package com.co.samtel.service;

import java.util.List;

import com.co.samtel.model.entity.Persona;

public interface IPersonaService {

	public List<Persona>findAll();
	
	public Persona findById (String numdoc);
	
	public Persona save( Persona persona);
	
	public void delete (String numdoc);
	
	
}
