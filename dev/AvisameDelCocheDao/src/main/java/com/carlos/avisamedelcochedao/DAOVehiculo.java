/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochedao;

import com.carlos.avisamedelcochebusiness.Coche;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface DAOVehiculo {
    
    Coche buscarVehiculo(String matricula);
    
    void actualizarVehiculo(Coche coche);
    
    void insertarVehiculo(Coche coche);
    
    List<Coche> buscarVehiculos(String matricula);
    
    Coche altaCoche(Coche coche);
}
