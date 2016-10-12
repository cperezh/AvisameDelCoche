package com.carlos.avisamedelcoche.dao;

import java.util.List;

import com.carlos.avisamedelcochebusiness.Componente;

public interface DAOComponente {

	/**
	 * Devuelve todo el catalogo de componentes, ordernada por nombre
	 * @return
	 */
	List<Componente> getComponentes();
}
