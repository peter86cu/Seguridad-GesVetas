package com.ayalait.seguridad.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.ayalait.seguridad.modelo.*;

public interface HistoricoCambioJPASpring extends JpaRepository <HistoricoCambio, String> {

	@Query(value="SELECT * FROM historico_cambio WHERE idapertura = :id and idmoneda=:moneda", nativeQuery=true)
	HistoricoCambio obtenerHistoricoCambioPorApertura(@Param("id") String id, @Param("moneda") String moneda);
}
