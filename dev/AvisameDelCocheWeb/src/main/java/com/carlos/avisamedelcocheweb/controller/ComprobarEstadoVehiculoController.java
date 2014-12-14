/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcocheweb.controller;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochebusiness.EstadoComponente;
import javax.ejb.EJB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/comprobarEstadoVehiculo")
public class ComprobarEstadoVehiculoController {

    @EJB(mappedName = "java:module/AvisameDelCocheEJB!com.carlos.avisamedelcoche.AvisameDelCocheService")
    AvisameDelCocheService avisameDelCocheService;

    @RequestMapping("/init")
    public void init() {

    }

    @RequestMapping("/buscar")
    @ResponseBody
    public Coche buscarCoche(@ModelAttribute Coche coche) {

        coche = avisameDelCocheService.buscarVehiculo(coche);

        return coche;
    }

    @RequestMapping("/comprobarEstado")
    @ResponseBody
    public Coche comprobarEstado(@ModelAttribute Coche coche) {

        avisameDelCocheService.comprobarEstadoVehiculo(coche);

        return coche;
    }
    
    @RequestMapping("/actualizarKilometraje")
    @ResponseBody
    public Coche actualizarKilometraje(@ModelAttribute Coche coche){
        avisameDelCocheService.actualizarVehiculo(coche);
        
        return coche;
    }

    @RequestMapping("/avisadorDelCocheModificar")
    @ResponseBody
    public Coche avisarDeReparacionModificar() {

        Coche coche;

        //coche = Coche.crearCocheDePrueba();
        coche = new Coche();
        coche.setMatricula("4731DSD");

        coche = avisameDelCocheService.buscarVehiculo(coche);

        coche.setKilometraje(190000);
        ((EstadoComponente) (coche.getEstadoComponentes().get(0))).setUltimaSustitucion(100000);

        avisameDelCocheService.actualizarVehiculo(coche);

        return coche;
    }

}
