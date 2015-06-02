/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochers;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochers.beans.CocheBean;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

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
    public Coche actualizarKilometraje(@PathParam("matricula") String matricula, @FormParam("kilometraje") Integer kilometraje) {
        return avisameDelCoche.actualizarKilometraje(matricula, kilometraje);
    }

    @GET
    @Path("/{matricula}/estado")
    public void comprobarEstado(@PathParam("matricula") String matricula) {
        avisameDelCoche.comprobarEstadoVehiculo(matricula);
    }

    @GET
    public List<Coche> buscarCoches(@QueryParam("matricula") String matricula) {
        return avisameDelCoche.buscarVehiculos(matricula);
    }
    
    @PUT
    public Coche altaCoche(@BeanParam CocheBean cocheBean) {
        
        return avisameDelCoche.altaCoche(cocheBean.toCoche());
    }
}
