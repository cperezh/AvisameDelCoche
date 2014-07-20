/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochedaoejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
public class DAOVehiculoEJB {

    @PersistenceContext
    EntityManager entityManager;

   
    
     @Override
    public void insertar(Coche coche) {
        entityManager.persist(coche);
    }

    @Override
    public Coche buscar(Long id) {
        
        Coche movimientoEncontrado = entityManager.find(Coche.class, id);

        return movimientoEncontrado;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
