package com.co.samtel.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.co.samtel.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, String > {

}
