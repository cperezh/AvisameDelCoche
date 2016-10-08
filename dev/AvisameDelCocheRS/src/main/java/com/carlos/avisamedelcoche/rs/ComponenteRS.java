package com.carlos.avisamedelcoche.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.carlos.avisamedelcochebusiness.Componente;

@Path("/componentes")
@Produces(MediaType.APPLICATION_JSON)
public class ComponenteRS {

	@GET
	public Componente[] getTodosComponentes() {
		return Componente.values();
	}
	
	@GET
	@Path("/{componente}")
	public Componente getComponente(@PathParam("componente") String nombreComponente){
		return null;
	}
}
