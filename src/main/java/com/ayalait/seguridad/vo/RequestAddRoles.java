package com.ayalait.seguridad.vo;

import java.io.Serializable;

import com.ayalait.seguridad.modelo.*;



public class RequestAddRoles implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Roles roles;

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	
	

}
