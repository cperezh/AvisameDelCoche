/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochers;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Carlos
 */
@Path("/coches")
public class CocheRS {

    @EJB
    AvisameDelCocheService avisameDelCoche;

    @GET
    @Path("/{matricula}")
    public Coche buscarCoche(@PathParam("matricula") String matricula) {
        return avisameDelCoche.buscarVehiculo(matricula);
    }
    
    @POST
    @Path("/{matricula}/kilometraje")
    public Coche actualizarKilometraje(@PathParam("matricula") String matricula, @FormParam("kilometraje") Integer kilometraje ){
        return avisameDelCoche.actualizarKilometraje(matricula,kilometraje);
    }
}
