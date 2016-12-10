    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcocheweb.controller;

import javax.ejb.EJB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carlos.avisamedelcoche.service.CocheService;
import com.carlos.avisamedelcochebusiness.Coche;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/comprobarEstadoVehiculo")
public class ComprobarEstadoVehiculoController {

    @EJB(mappedName = "java:module/AvisameDelCocheEJB!com.carlos.avisamedelcoche.AvisameDelCocheService")
    CocheService avisameDelCocheService;

    @RequestMapping("/init")
    public void init() {
        
    }

    @RequestMapping("/buscar")
    @ResponseBody
    public Coche buscarCoche(@ModelAttribute Coche coche) {

        coche = avisameDelCocheService.buscarVehiculo(coche.getMatricula());

        return coche;
    }

    @RequestMapping("/comprobarEstado")
    @ResponseBody
    public void comprobarEstado(@ModelAttribute Coche coche) {

        avisameDelCocheService.comprobarEstadoVehiculo(coche.getMatricula());

    }

    @RequestMapping("/actualizarKilometraje")
    @ResponseBody
    public Coche actualizarKilometraje(@ModelAttribute Coche coche) {

        coche = avisameDelCocheService.actualizarKilometraje(coche.getMatricula(), coche.getKilometraje());

        return coche;
    }

}
