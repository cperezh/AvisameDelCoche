/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochedao;

import com.carlos.avisamedelcochebusiness.Coche;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface DAOVehiculo {
    Coche buscarVehiculo(String matricula);
}