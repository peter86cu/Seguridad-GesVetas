package com.ayalait.seguridad.service;

import java.util.ArrayList;
import java.util.List;

import com.ayalait.seguridad.repositorio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

import com.ayalait.seguridad.vo.*;
import com.ayalait.seguridad.modelo.*;
import com.ayalait.seguridad.dao.*;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesDao dao;
	
	@Autowired
	ModulosJPASpring daoModulos;
	
	@Autowired
	GestionesJPASpring daoGestiones;
	
	
	@Override
	public ResponseEntity<String> agregarRol(String datos) {
		RequestAddRoles request = new Gson().fromJson(datos, RequestAddRoles.class);
		
		if(dao.recuperarRolPorId(request.getRoles().getIdrol())==null) {
			dao.agregarRol(request.getRoles());
			return new ResponseEntity<String>(com.ayalait.seguridad.utils.Constants.RESULTADO_OK,HttpStatus.ACCEPTED);			}
		return new ResponseEntity<String>(com.ayalait.seguridad.utils.Constants.RESULTADO_NOK,HttpStatus.NOT_ACCEPTABLE);
	}

	@Override
	public List<Roles> listarRoles() {
		return dao.listarRoles();
	}

	@Override
	public void actualizarRol(Roles rol) {
		if(dao.recuperarRolPorId(rol.getIdrol())!=null) {
			dao.actualizarRol(rol);
		}

	}

	@Override
	public boolean eliminarRol(int idRol) {
		if(dao.recuperarRolPorId(idRol)!=null) {
			dao.eliminarRol(idRol);
			return true;
		}
		return false;
	}

	
	@Override
	public Roles buscarRol(int rol) {
		return dao.recuperarRolPorId(rol);
	}

	@Override
	public String obtenerDescripcionRol(int id) {		
		return  dao.descripcionRol(id);
	}

	@Override
	public List<Modulos> listaModulosUsuarios(String usuario) {

		List<Modulos> list=daoModulos.obtenerListaModulosPorUsuario(usuario);
		return list;
	}

	/*@Override
	public List<Gestiones> listadoGestionesPorModulos(int idmodulo) {
		return daoGestiones.obtenerGestionesPorModulos(idmodulo);
	}*/

	@Override
	public Roles obtenerRolPorUsuario(String idusuario) {
		return dao.obtenerRolPorUsuario(idusuario);
	}

	@Override
	public List<ObjectPermisos> obtenerPermisosPorModulos(int idmodulo) {
		List<ObjectPermisos> permisos = new ArrayList<ObjectPermisos>();
		List<Gestiones> gestiones = daoGestiones.obtenerGestionPorModulo(idmodulo);
		if(gestiones!=null) {
			for(Gestiones gest: gestiones) {
				ObjectPermisos obj= new ObjectPermisos();
				obj.setGestion(gest);
				List<AccionesGestion> acciones= daoGestiones.obtenerAccionesPorGestion(gest.getIdgestion());
				if (acciones!=null) {
					obj.setAccion(acciones);
				}
				permisos.add(obj);
			}
		}
		return permisos;
	}

}
