package com.co.samtel.service;

import java.util.List;

import com.co.samtel.model.entity.Perfil;

public interface IPerfilService {

	public List<Perfil>findAll();
	
	public Perfil findById(String codPerfil);
	
	public Perfil save (Perfil perfil);
}
