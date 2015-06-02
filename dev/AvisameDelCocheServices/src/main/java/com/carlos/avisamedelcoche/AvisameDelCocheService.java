/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import com.carlos.avisamedelcochebusiness.Coche;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface AvisameDelCocheService{

    Coche actualizarKilometraje(String matricula, int kilometraje);
    
    void comprobarEstadoVehiculo(String matricula);
    
    Coche buscarVehiculo(String matricula);
    
    void actualizarVehiculo(Coche coche);
    
    List<Coche> buscarVehiculos(String matricula);
    
    Coche altaCoche(Coche coche);
}
