package com.ayalait.seguridad.dao;

import java.util.List;

import com.ayalait.seguridad.modelo.AdministracionLog;
import com.ayalait.seguridad.modelo.EstadoProceso;


public interface ProcesosDao {
	
	List<EstadoProceso> listadoEstadoProceso();
	
	void agregarEjecucionProceso(AdministracionLog log);

}
