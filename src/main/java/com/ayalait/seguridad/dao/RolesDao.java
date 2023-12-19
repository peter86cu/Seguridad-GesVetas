package com.ayalait.seguridad.dao;

import java.util.List;

import com.ayalait.seguridad.modelo.*;


public interface RolesDao {
	void agregarRol(Roles rol);
	

	List<Roles> listarRoles();
	
	void eliminarRol(int idRol);
	
	Roles recuperarRolPorId(int idRol);
	
	void actualizarRol(Roles rol);
	
	String descripcionRol(int id);
	
	Roles obtenerRolPorUsuario(String usuario);
	
	
}
