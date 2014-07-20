/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcocheweb.controller;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/avisadorDelCoche")
public class AvisameDelCocheController {

    @Autowired
    AvisameDelCocheService avisameDelCocheService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String avisarDeReparacion() {

        Coche coche;

        coche = Coche.crearCocheDePrueba();

        avisameDelCocheService.comprobarEstadoVehiculo(coche);

        return "OK";
    }
    
}
