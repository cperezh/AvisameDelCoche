/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochedao;

import com.carlos.avisamedelcochebusiness.Coche;

/**
 *
 * @author Carlos
 */
public interface DAOVehiculo {
    Coche buscarVehiculo(String matricula);
}
