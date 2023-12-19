package com.ayalait.seguridad.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ayalait.seguridad.modelo.*;


public interface RolesJpaSpring extends JpaRepository<Roles, Integer>{
	
	@Query(value="SELECT roles.* FROM usuarios JOIN roles ON (roles.idrol=usuarios.idrol) WHERE idusuario=:idusuario", nativeQuery=true)
	Roles findRolesByUser(@Param("idusuario") String idusuario);
}
