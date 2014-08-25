/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import com.carlos.avisamedelcochebusiness.Coche;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface AvisameDelCocheService{

    void comprobarEstadoVehiculo(Coche coche);
    
    Coche buscarVehiculo(Coche coche);
    
    void actualizarVehiculo(Coche coche);
}
