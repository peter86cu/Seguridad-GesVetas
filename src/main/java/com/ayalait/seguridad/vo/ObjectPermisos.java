package com.ayalait.seguridad.vo;

import java.util.List;

import com.ayalait.seguridad.modelo.*;

public class ObjectPermisos {
	
	private Gestiones gestion;
	private List<AccionesGestion> accion;

	public List<AccionesGestion> getAccion() {
		return accion;
	}

	public void setAccion(List<AccionesGestion> accion) {
		this.accion = accion;
	}

	public Gestiones getGestion() {
		return gestion;
	}

	public void setGestion(Gestiones gestion) {
		this.gestion = gestion;
	}
	
	
	

}
