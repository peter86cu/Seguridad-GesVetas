package com.ayalait.seguridad.service;

import org.springframework.http.ResponseEntity;

import com.ayalait.seguridad.modelo.AdministracionLog;

public interface ProcesosService {

	ResponseEntity<String> agregarEjecucionProceso(String log);
	
	ResponseEntity<String> listadoEstadoProceso();

}
