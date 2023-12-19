package com.ayalait.seguridad.dao;

import com.ayalait.seguridad.modelo.EstadoUsuarios;

import com.ayalait.seguridad.repositorio.EstadoUsuarioJpaSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ParametrosUsuariosDaoImpl implements ParametrosUsuariosDao{

    @Autowired
    EstadoUsuarioJpaSpring daoEstadoUsuario;

   
    
    @Override
    public List<EstadoUsuarios> listaEstadosUsuarios() {
        return daoEstadoUsuario.findAll();
    }

	
}
