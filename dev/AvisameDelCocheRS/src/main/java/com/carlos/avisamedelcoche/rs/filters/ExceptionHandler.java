package com.carlos.avisamedelcoche.rs.filters;

import java.util.ResourceBundle;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.rs.CocheRS;
import com.carlos.avisamedelcoche.rs.filters.exception.NotFoundException;

/**
 * Manejador generico de Excepciones, para capturar todas las excepciones no
 * tratadas. Devuelve un mensaje de Error y un 500 Internal Server Error
 * 
 * @author Carlos
 *
 */
@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {

	static final Logger logger = LogManager.getLogger(CocheRS.class.getName());

	@Override
	public Response toResponse(Exception ex) {
		
		Status status;
		ErrorMessage error;

		ResourceBundle errores = ResourceBundle.getBundle(Recursos.ERRORES.getPropertiesFile());

		if (ex instanceof NotFoundException){
			status = Status.NOT_FOUND;
			error = new ErrorMessage(errores.getString("notFound"));
			logger.warn(ex);
		}
		else{
			status = Status.INTERNAL_SERVER_ERROR;
			error = new ErrorMessage(errores.getString("errorGenerico"));
			logger.fatal(ex);
			ex.printStackTrace();
		}
		
		return Response.status(status)
				.entity(error).type(MediaType.APPLICATION_JSON).build();

	}

}
