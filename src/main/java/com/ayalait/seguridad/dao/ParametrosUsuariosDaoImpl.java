package com.ayalait.seguridad.dao;

import com.ayalait.seguridad.modelo.EstadoUsuarios;
import com.ayalait.seguridad.modelo.Moneda;
import com.ayalait.seguridad.repositorio.EstadoUsuarioJpaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ParametrosUsuariosDaoImpl implements ParametrosUsuariosDao{

    @Autowired
    EstadoUsuarioJpaSpring daoEstadoUsuario;

    @Autowired
	MonedaJPASpring daoMoneda;
    
    @Override
    public List<EstadoUsuarios> listaEstadosUsuarios() {
        return daoEstadoUsuario.findAll();
    }



	@Override
	public List<Moneda> obtenerMoneda() {
		return daoMoneda.findAll();
	}

	
}
