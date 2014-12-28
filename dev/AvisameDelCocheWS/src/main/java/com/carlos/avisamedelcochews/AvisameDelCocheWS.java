/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochews;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
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

    @EJB(mappedName = "java:module/AvisameDelCocheEJB!com.carlos.avisamedelcoche.AvisameDelCocheService")
    AvisameDelCocheService avisameDelCocheService;

    @WebMethod
    public Coche buscarVehiculo(@WebParam(name="matricula") String matricula) {
        
        Coche coche;
        
        coche = new Coche();
        coche.setMatricula(matricula);
        
        coche = avisameDelCocheService.buscarVehiculo(coche);

        return coche;
    }
}
