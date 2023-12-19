package com.ayalait.seguridad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ayalait.seguridad.modelo.AdministracionLog;
import com.ayalait.seguridad.modelo.EstadoProceso;
import com.ayalait.seguridad.repositorio.AdminLogJpaSpring;
import com.ayalait.seguridad.repositorio.EstadoProcesoJpaSpring;

@Repository
public class ProcesosDaoImpl implements ProcesosDao {

	@Autowired
	AdminLogJpaSpring daoProcesos;
	
	@Autowired
	EstadoProcesoJpaSpring daoEstadoProceso;
	
	@Override
	public void agregarEjecucionProceso(AdministracionLog log) {
			daoProcesos.save(log);
	}

	@Override
	public List<EstadoProceso> listadoEstadoProceso() {
		
		return daoEstadoProceso.findAll();
	}

}
