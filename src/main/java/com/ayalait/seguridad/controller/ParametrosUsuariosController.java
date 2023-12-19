package com.ayalait.seguridad.controller;

import com.ayalait.seguridad.service.ParametrosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParametrosUsuariosController {

    @Autowired
    ParametrosUsuariosService service;

    @GetMapping(value="parametros/estados-usuarios",produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> listadoEstadoUsuario() throws Exception {
        return service.listaEstadoUsuarios();


    }
    
    
}
