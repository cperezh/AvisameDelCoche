/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.service.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;

/**
 *
 * @author Carlos
 */
@Path("/coches")
@Produces(MediaType.APPLICATION_JSON)
public class CocheRS {

	@EJB
	AvisameDelCocheService avisameDelCoche;

	static final Logger logger = LogManager.getLogger(CocheRS.class.getName());

	@GET
	@Path("/{matricula}")
	public Response buscarCoche(@PathParam("matricula") String matricula) {

		Coche coche = avisameDelCoche.buscarVehiculo(matricula);

		return Response.ok(coche).build();

	}

	@POST
	@Path("/{matricula}")
	public Response modificarCoche(Coche coche) {

		avisameDelCoche.modificar(coche);

		return Response.ok(coche).build();
	}

	@GET
	@Path("/{matricula}/estado")
	public Response comprobarEstado(@PathParam("matricula") String matricula) {
		avisameDelCoche.comprobarEstadoVehiculo(matricula);

		return Response.ok().build();
	}

	@GET
	public Response buscarCoches(@QueryParam("matricula") String matricula) {

		List<Coche> coches = new ArrayList<Coche>(avisameDelCoche.buscarVehiculos(matricula));
		
		GenericEntity<List<Coche>> entity = new GenericEntity<List<Coche>>(coches) {};

		return Response.ok(entity).build();
	}

	@PUT
	public Response altaCoche(Coche coche) {

		avisameDelCoche.altaCoche(coche);

		return Response.ok(coche).build();
	}

}
