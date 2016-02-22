/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche.rs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.service.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;

/**
 *
 * @author Carlos
 */
@Path("/coches")
public class CocheRS {

    @EJB
    AvisameDelCocheService avisameDelCoche;

    static final Logger logger = LogManager.getLogger(CocheRS.class.getName());

    @GET
    @Path("/{matricula}")
    public Coche buscarCoche(@PathParam("matricula") String matricula) {
        return avisameDelCoche.buscarVehiculo(matricula);
    }
    
    @POST
    @Path("/{matricula}")
    public Coche modificarCoche(Coche coche){
    	return avisameDelCoche.modificar(coche);
    }

    @GET
    @Path("/{matricula}/estado")
    public Coche comprobarEstado(@PathParam("matricula") String matricula) {
        return avisameDelCoche.comprobarEstadoVehiculo(matricula);
    }

    @GET
    public List<Coche> buscarCoches(@QueryParam("matricula") String matricula) {
        return avisameDelCoche.buscarVehiculos(matricula);
    }

    @PUT
    public void altaCoche(Coche coche) {

        logger.info("Entrando Alta Coche: "+coche.getMatricula());
        avisameDelCoche.altaCoche(coche);
        logger.info("Saliendo Alta Coche: "+coche.getMatricula());

    }
    
   
}
