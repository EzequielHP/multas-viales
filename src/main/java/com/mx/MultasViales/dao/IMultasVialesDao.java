package com.mx.MultasViales.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.MultasViales.dominio.MultasViales;

public interface IMultasVialesDao extends JpaRepository<MultasViales, Long> {
	// Hacemo herencia de la clase JpaRepository poder trabajar con los metodos que
	// nos brinda
}
