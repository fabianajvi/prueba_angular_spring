package com.co.samtel.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "usuarios")
public class Usuario implements Serializable {
	
	@Id
	private String usuario;
	
	@Column(name="numdoc")
	private String numdoc;
	
	@Column(name="perfil")
	private int perfil;
	
	@Column(name="habilitado")
	private boolean habilitado;
	
	//Evento para registrar la fecha de creación del dato
	@PrePersist
	public void PrePersist() {
		fechaCreacion = new Date();
	}
	
	@Column(name="fechacreacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@Column(name="fechamodificacion")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;
	
	private static final long serialVersionUID = 1L;

	//Getters 
	public String getUsuario() {
		return usuario;
	}

	//Getters 
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	//Getters 
	public String getNumdoc() {
		return numdoc;
	}
	//Getters 
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	//Getters 
	public int getPerfil() {
		return perfil;
	}

	//Setters
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	
	//Setters
	public boolean isHabilitado() {
		return habilitado;
	}

	//Setters
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	//Setters
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	//Setters
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	//Setters
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	//Setters
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	//Setters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	
}
