package com.ayalait.seguridad.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ayalait.seguridad.modelo.AdministracionLog;




public interface AdminLogJpaSpring extends JpaRepository<AdministracionLog, Integer>{

}
