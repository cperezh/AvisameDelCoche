
package com.carlos.avisamedelcochespringservice;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.AvisameDelCocheFacade;
import com.carlos.avisamedelcochebusiness.Coche;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
@Service
public class AvisameDelCocheSpringService implements AvisameDelCocheService{

    @Override
    public void comprobarEstadoVehiculo(String matricula){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
     public Coche buscarVehiculo(String matricula){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarVehiculo(Coche coche) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Coche actualizarKilometraje(String matricula, int kilometraje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
