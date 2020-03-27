package com.co.samtel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.samtel.model.dao.IPerfilDao;
import com.co.samtel.model.entity.Perfil;

@Service
public class PerfilServiceImpl implements IPerfilService {

	@Autowired 
	IPerfilDao perfilDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Perfil> findAll() {
		return (List<Perfil>) perfilDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Perfil findById(String codPerfil) {
		return perfilDao.findById(codPerfil).orElse(null);
	}

	@Override
	@Transactional
	public Perfil save(Perfil perfil) {
		return perfilDao.save(perfil);
	}

	
}
