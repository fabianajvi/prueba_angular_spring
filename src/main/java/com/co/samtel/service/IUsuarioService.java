package com.co.samtel.service;

import java.util.List;

import com.co.samtel.model.entity.Usuario;

public interface IUsuarioService  {

	public List<Usuario>findAll();
	
	public Usuario save (Usuario usuario);
	
	public Usuario findById (String usuario);
	
	public void delete (String usuario);
}
