package com.carlos.avisamedelcoche.dao.utilidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.carlos.avisamedelcoche.dao.DAOUtilidades;

@Stateless		
public class DAOUtilidadesEJB implements DAOUtilidades{

	@PersistenceContext
	EntityManager entityManager;
	
	public void vaciarCacheSegundoNivel(){
		entityManager.getEntityManagerFactory().getCache().evictAll();
	}
	
}
