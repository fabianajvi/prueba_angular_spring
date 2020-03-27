package com.co.samtel.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.co.samtel.model.entity.Persona;

public interface IPersonaDao  extends CrudRepository<Persona, String>{

}
