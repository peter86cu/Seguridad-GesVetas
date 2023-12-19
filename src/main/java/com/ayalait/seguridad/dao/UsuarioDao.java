package com.ayalait.seguridad.dao;

import java.util.List;

import com.ayalait.seguridad.modelo.*;

public interface UsuarioDao {
	void agregarUsuario(Usuarios Usuario);
	
	List<Usuarios> devolverUsuarios();
	
	
	Usuarios recuperarUsuarioPorId(String idUsuario);
	
	Usuarios recuperarUsuario(String user);
	
	void actualizarUsuario(Usuarios Usuario);
	
	void cambiarPassword(String idUsuario, String password);
	
	List<Usuarios> getUsuariosPorIdEmpresa(String id);
	
	void eliminarUsuarioPorId(String id);
	
	

}
