package com.ayalait.seguridad.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ayalait.seguridad.vo.*;
import com.ayalait.seguridad.modelo.*;


public interface RolesService {
	ResponseEntity<String> agregarRol(String rol);
	List<Modulos> listaModulosUsuarios(String usuario);

	List<Roles> listarRoles();
	void actualizarRol(Roles rol);
	boolean eliminarRol(int idRol);	
	Roles buscarRol(int idRol);
	String obtenerDescripcionRol(int id);
	//List<Gestiones> listadoGestionesPorModulos(int idmodulo);
	Roles obtenerRolPorUsuario(String idusuario);
	List<ObjectPermisos> obtenerPermisosPorModulos(int idmodulo);
}
