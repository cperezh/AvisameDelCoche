package com.carlos.avisamedelcoche.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.carlos.avisamedelcoche.rs.filters.exception.NotFoundException;
import com.carlos.avisamedelcoche.service.ComponenteService;
import com.carlos.avisamedelcochebusiness.Componente;

@Path("/componentes")
@Produces(MediaType.APPLICATION_JSON)
public class ComponenteRS {

	@EJB
	ComponenteService componenteService;

	@GET
	/**
	 * 
	 * @param q
	 *            query para buscar componentes all: buscar todos los
	 *            componentes
	 * @return
	 */
	public List<Componente> getTodosComponentes(@QueryParam("q") String q) {

		List<Componente> componentes = new ArrayList<Componente>();

		if (q.equals("all")) {
			componentes = componenteService.getComponentes();
		}

		return componentes;
	}

	@PUT
	@Path("/{idComponente}")
	public Componente modificarComponente(@PathParam("idComponente") int idComponente,Componente componente) throws NotFoundException{

		if (componenteService.getComponente(idComponente) == null) {
			throw new NotFoundException("/componentes -->" + idComponente);
		} else {
			return componenteService.modificarComponente(componente);
		}

	}

	@GET
	@Path("/{idComponente}")
	public Componente getComponente(@PathParam("idComponente") int idComponente) throws NotFoundException {

		if (componenteService.getComponente(idComponente) == null) {
			throw new NotFoundException("/componentes/" + idComponente);
		} else {
			return componenteService.getComponente(idComponente);
		}

	}

}
