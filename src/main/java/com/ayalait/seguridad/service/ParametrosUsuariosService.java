package com.ayalait.seguridad.service;

import org.springframework.http.ResponseEntity;

public interface ParametrosUsuariosService {

    ResponseEntity<String> listaEstadoUsuarios();
    
	ResponseEntity<String> obtenerMonedas();


}
