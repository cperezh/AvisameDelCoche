/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcocheEJB;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.AvisameDelCocheFacade;
import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochedao.DAOVehiculo;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Pakno
 */
@Stateless
public class AvisameDelCocheEJB implements AvisameDelCocheService {
    
    @EJB(mappedName = "java:module/DAOVehiculoEJB!com.carlos.avisamedelcochedao.DAOVehiculo")
    DAOVehiculo daoVehiculo;

    @Override
    public void comprobarEstadoVehiculo(Coche coche) {

        coche = daoVehiculo.buscarVehiculo(coche.getMatricula());
        
        AvisameDelCocheFacade.comprobarEstadoVehiculo(coche);

    }

    @Override
    public void actualizarVehiculo(Coche coche) {
       
        daoVehiculo.actualizarVehiculo(coche);
    }

    @Override
    public Coche buscarVehiculo(Coche coche) {
       
        coche = daoVehiculo.buscarVehiculo(coche.getMatricula());
       
       return coche;
    }
}
