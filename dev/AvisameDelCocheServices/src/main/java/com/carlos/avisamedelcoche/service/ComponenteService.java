package com.carlos.avisamedelcoche.service;

import java.util.List;

import com.carlos.avisamedelcochebusiness.Componente;

public interface ComponenteService {

	List<Componente> getComponentes();
	
	Componente getComponente(int idComponente);
	
	Componente modificarComponente(Componente componente);
}
