/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochedaoejb;

import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochedao.DAOVehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author martin
 */
@Stateless
public class DAOVehiculoEJB implements DAOVehiculo {

    @PersistenceContext
    EntityManager entityManager;

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
        return entityManager.createNamedQuery("Coche.buscarCochesPorMatricula", Coche.class)
                .setParameter("matricula", "%" + matricula + "%")
                .getResultList();

    }

    @Override
    public Coche altaCoche(Coche coche) {
        entityManager.persist(coche);

        return coche;
    }
}
