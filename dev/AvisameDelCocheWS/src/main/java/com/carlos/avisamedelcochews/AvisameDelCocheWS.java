/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochews;

import com.carlos.avisamedelcoche.service.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Carlos
 */
@WebService
public class AvisameDelCocheWS {

    @EJB
    AvisameDelCocheService avisameDelCocheService;

    @WebMethod
    public Coche buscarVehiculo(@WebParam(name = "matricula") String matricula) {

        Coche coche = avisameDelCocheService.buscarVehiculo(matricula);

        return coche;
    }
}
