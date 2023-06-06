package com.mx.MultasViales.servicios;

import java.util.List;

import com.mx.MultasViales.dominio.MultasViales;

public interface IMultasVialesServ {

	public void guardar(MultasViales multa);

	public void editar(MultasViales multa);

	public void eliminar(MultasViales multa);

	public MultasViales buscar(MultasViales multa);

	public List<MultasViales> listar();
}
