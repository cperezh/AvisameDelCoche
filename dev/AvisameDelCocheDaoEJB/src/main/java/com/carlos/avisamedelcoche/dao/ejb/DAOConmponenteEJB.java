package com.carlos.avisamedelcoche.dao.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.dao.DAOComponente;
import com.carlos.avisamedelcochebusiness.Componente;

@Stateless
public class DAOConmponenteEJB implements DAOComponente{
	
	@PersistenceContext
	EntityManager entityManager;
	
	static final Logger logger = LogManager.getLogger(DAOVehiculoEJB.class.getName());

	@Override
	public List<Componente> getComponentes() {
		
		List<Componente> componentes;
		
		componentes = entityManager.createNamedQuery("Componente.buscarTodosComponentes",Componente.class).getResultList();
		
		return componentes;
	}

	@Override
	public Componente getComponente(int idComponente) {
		
		return entityManager.find(Componente.class,idComponente);
	}

	@Override
	public Componente modificarComponente(Componente componente) {
		
		return entityManager.merge(componente);
	}

	@Override
	public List<Componente> buscarComponentes(String nombre) {
		
		return entityManager.createNamedQuery("Componente.buscarComponentes",Componente.class)
				.setParameter("componente", "%"+nombre+"%")
				.getResultList();
	}

}
