package com.carlos.avisamedelcochers;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.service.util.UtilidadesService;

@Path("/util")
public class UtilidadesRS {

	@EJB
	UtilidadesService utilidadesService;

	static final Logger logger = LogManager.getLogger(UtilidadesRS.class.getName());
	
	@GET	
    @Path("/cache")
    public void vaciarCacheSegundoNivel() {
		
		logger.warn("Vaciando cache");
        utilidadesService.vaciarCacheSegundoNivel();
        logger.warn("Cache vaciada");
    }
}
