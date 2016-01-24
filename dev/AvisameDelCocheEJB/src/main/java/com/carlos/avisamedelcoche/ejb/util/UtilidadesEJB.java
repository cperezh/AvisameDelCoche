package com.carlos.avisamedelcoche.ejb.util;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.carlos.avisamedelcoche.dao.DAOUtilidades;
import com.carlos.avisamedelcoche.service.util.UtilidadesService;

@Stateless	
public class UtilidadesEJB implements UtilidadesService{

	@EJB
	DAOUtilidades daoUtilidades;	
	
	public void vaciarCacheSegundoNivel(){
		daoUtilidades.vaciarCacheSegundoNivel();
	}
}
