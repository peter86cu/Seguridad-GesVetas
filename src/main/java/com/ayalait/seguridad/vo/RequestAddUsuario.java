package com.ayalait.seguridad.vo;

import java.io.Serializable;


import com.ayalait.seguridad.modelo.*;



public class RequestAddUsuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Usuarios user;

	public Usuarios getUsuario() {
		return user;
	}

	public void setUsuario(Usuarios usuario) {
		this.user = usuario;
	}
	
	

	
	

}
