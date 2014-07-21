/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochedaoejb;

import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochedao.DAOVehiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
public class DAOVehiculoEJB implements DAOVehiculo{

    @PersistenceContext
    EntityManager entityManager;

   
    @Override
    public Coche buscarVehiculo(String matricula) {
        
        Coche movimientoEncontrado = entityManager.find(Coche.class, matricula);

        return movimientoEncontrado;
    }
}
