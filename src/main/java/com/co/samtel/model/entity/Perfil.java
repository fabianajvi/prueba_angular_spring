package com.co.samtel.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codperfil")
	private String codPerfil;
	
	
	@Column(name="descripcion")
	private String descripcion;


	public String getCodPerfil() {
		return codPerfil;
	}


	public void setCodPerfil(String codPerfil) {
		this.codPerfil = codPerfil;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	} 
	
	
}
