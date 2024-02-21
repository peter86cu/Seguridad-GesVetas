package com.ayalait.seguridad.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ayalait.seguridad.modelo.Moneda;




public interface MonedaJPASpring extends JpaRepository <Moneda, String> {



}
