package com.ayalait.seguridad.dao;

import com.ayalait.seguridad.modelo.*;

import java.util.List;

public interface ParametrosUsuariosDao {

    //Estado usuarios
    List<EstadoUsuarios> listaEstadosUsuarios();
    
    List<Moneda> obtenerMoneda();
}
