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
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.service.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;

/**
 *
 * Servicio REST para Coches
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
	public Coche buscarCoche(@PathParam("matricula") String matricula) {

		return avisameDelCoche.buscarVehiculo(matricula);

	}

	@POST
	@Path("/{matricula}")
	public Coche modificarCoche(Coche coche) {

		return avisameDelCoche.modificar(coche);
	}

	@GET
	@Path("/{matricula}/estado")
	public Coche comprobarEstado(@PathParam("matricula") String matricula) {

		return avisameDelCoche.comprobarEstadoVehiculo(matricula);
	}

	/**
	 * Busca un coche por su matricula. Si no lo encuentra, devuelve un coche vacio
	 * @param matricula
	 * @return
	 */
	@GET
	public List<Coche> buscarCoches(@QueryParam("matricula") String matricula) {

		List<Coche> coches = new ArrayList<Coche>();

		if (matricula == null) {
			coches.add(Coche.cocheVacio());
		} else {
			coches = avisameDelCoche.buscarVehiculos(matricula);
		}
		return coches;
	}

	
	@PUT
	public Coche altaCoche(Coche coche) {

		return avisameDelCoche.altaCoche(coche);
	}

}
