package com.mx.MultasViales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MultasViales.dominio.MultasViales;
import com.mx.MultasViales.servicios.IMultasVialesServ;

@RestController
@RequestMapping("MultasVialesWs")
@CrossOrigin
public class MultasVialesWs {

	//Hacemos inyeccion de dependecias para no estar inicializando siempre nuestros objetos
	@Autowired
	IMultasVialesServ multasVialesServ;

	// Controladores Mapeados para ser consumismos desde postman
	
	
	//Este metodo listar no va a permitir mostrar los registros que esten almacenado en H2
	// http://localhost:9000/MultasVialesWs/listar
	@GetMapping("listar")
	public List<MultasViales> listar() {

		return multasVialesServ.listar();
	}
	
	//El metodo guardar nos va permitir insertar o crear un nuevo registro de Multa vial
	// http://localhost:9000/MultasVialesWs/guardar
	@PostMapping("guardar")
	public void guarda(@RequestBody MultasViales multa) {

		multasVialesServ.guardar(multa);
	}

	//El metodo buscar nos va permitir buscar un registro por su ID
	// http://localhost:9000/MultasVialesWs/buscar
	@PostMapping("buscar")
	public MultasViales buscar(@RequestBody MultasViales multa) {

		return multasVialesServ.buscar(multa);
	}

	// http://localhost:9000/MultasVialesWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody MultasViales multa) {
		multasVialesServ.editar(multa);

	}

	// http://localhost:9000/MultasVialesWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody MultasViales multa) {
		multasVialesServ.eliminar(multa);

	}

}
