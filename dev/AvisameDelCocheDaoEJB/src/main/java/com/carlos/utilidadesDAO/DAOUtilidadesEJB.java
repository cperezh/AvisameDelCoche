package com.carlos.utilidadesDAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless		
public class DAOUtilidadesEJB {

	@PersistenceContext
	EntityManager entityManager;
	
	public void vaciarCacheSegundoNivel(){
		entityManager.getEntityManagerFactory().getCache().evictAll();
	}
	
}
