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
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;

/**
 *
 * @author Pakno
 */
@Stateless
public class AvisameDelCocheEJB implements AvisameDelCocheService {

    @EJB
    DAOVehiculo daoVehiculo;

    @Override
    public void comprobarEstadoVehiculo(String matricula) {

        Coche coche = daoVehiculo.buscarVehiculo(matricula);

        AvisameDelCocheFacade.comprobarEstadoVehiculo(coche);

    }

    @Override
    public void actualizarVehiculo(Coche coche) {

        daoVehiculo.actualizarVehiculo(coche);
    }

    @Override
    public Coche buscarVehiculo(String matricula) {

        Coche coche = daoVehiculo.buscarVehiculo(matricula);

        return coche;
    }

    @Override
    @TransactionAttribute
    public Coche actualizarKilometraje(String matricula, int kilometraje) {

        Coche coche = daoVehiculo.buscarVehiculo(matricula);

        coche.setKilometraje(kilometraje);

        return coche;
    }
    
    @Override
    public List buscarVehiculos(String matricula){
        return daoVehiculo.buscarVehiculos(matricula);
    }
}
