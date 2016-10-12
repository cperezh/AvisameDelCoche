package com.carlos.avisamedelcoche.rs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.carlos.avisamedelcoche.service.ComponenteService;
import com.carlos.avisamedelcochebusiness.Componente;

@Path("/componentes")
@Produces(MediaType.APPLICATION_JSON)
public class ComponenteRS {
	
	@EJB
	ComponenteService componenteService;

	@GET
	public List<Componente> getTodosComponentes() {
		return componenteService.getComponentes();
	}
	
	@GET
	@Path("/{componente}")
	public Componente getComponente(@PathParam("componente") String nombreComponente){
		return null;
	}
}
