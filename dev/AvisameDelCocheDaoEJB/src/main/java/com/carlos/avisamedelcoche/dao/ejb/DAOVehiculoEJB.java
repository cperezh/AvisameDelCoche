/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche.dao.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.dao.DAOVehiculo;
import com.carlos.avisamedelcochebusiness.Coche;

@Stateless
public class DAOVehiculoEJB implements DAOVehiculo {

	@PersistenceContext
	EntityManager entityManager;
	
	//@EJB
	//AltaCocheJMS altaCocheJMS;

	static final Logger logger = LogManager.getLogger(DAOVehiculoEJB.class.getName());

	@Override
	public Coche buscarVehiculo(String matricula) {

		Coche cocheEncontrado = entityManager.find(Coche.class, matricula);

		return cocheEncontrado;
	}

	public List<Coche> buscarTodos() {

		CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();

		cq.select(cq.from(Coche.class));

		Query q = entityManager.createQuery(cq);

		return q.getResultList();
	}

	@Override
	public void actualizarVehiculo(Coche coche) {

		entityManager.merge(coche);
	}

	@Override
	public void insertarVehiculo(Coche coche) {
		entityManager.persist(coche);
	}

	@Override
	public List<Coche> buscarVehiculos(String matricula) {
		return entityManager.createNamedQuery("Coche.buscarCochesPorMatricula", Coche.class).setParameter("matricula", "%" + matricula + "%").getResultList();

	}

	@Override
	public Coche altaCoche(Coche coche) {

		entityManager.persist(coche);
		
		//altaCocheJMS.altaCoche(coche);

		return coche;
	}

	@Override
	public Coche modificarCoche(Coche coche) {
		entityManager.merge(coche);

		return coche;
	}
}
