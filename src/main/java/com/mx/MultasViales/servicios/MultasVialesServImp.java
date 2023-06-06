package com.mx.MultasViales.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.MultasViales.dao.MultasVialesDao;
import com.mx.MultasViales.dominio.MultasViales;

@Service
public class MultasVialesServImp implements IMultasVialesServ {

	//Hacemos inyeccion de dependecias para no estar inicializando siempre nuestros objetos
	@Autowired
	MultasVialesDao multasVialesDao;
	
	
	//Con ayuda de la clase jpa podemos usar los metodos para realizar un CRUD
	@Override
	@Transactional
	public void guardar(MultasViales multa) {
		multasVialesDao.save(multa);
	}

	@Override
	@Transactional
	public void editar(MultasViales multa) {
		multasVialesDao.save(multa);
	}

	@Override
	@Transactional
	public void eliminar(MultasViales multa) {
		multasVialesDao.delete(multa);

	}

	@Override
	@Transactional(readOnly = true)
	public MultasViales buscar(MultasViales multa) {

		return multasVialesDao.findById(multa.getId()).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<MultasViales> listar() {

		return multasVialesDao.findAll();
	}

}
