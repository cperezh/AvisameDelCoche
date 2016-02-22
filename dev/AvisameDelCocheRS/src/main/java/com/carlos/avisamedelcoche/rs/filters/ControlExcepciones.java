package com.carlos.avisamedelcoche.rs.filters;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.rs.CocheRS;

@WebFilter
public class ControlExcepciones implements Filter {

	static final Logger logger = LogManager.getLogger(CocheRS.class.getName());

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filtrando");

		try {
			chain.doFilter(request, response);

		} catch (Exception ex) {
			logger.fatal(ex);
			imprimirError(response);

		}

	}

	/**
	 * Imprime un objeto json con el error en la respuesta, además de declarar
	 * un error 500
	 * 
	 * @param ex
	 * @param response
	 */
	private void imprimirError(ServletResponse response) {

		try {
			((HttpServletResponse) response).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

			ResourceBundle errores = ResourceBundle.getBundle(Recursos.ERRORES.getPropertiesFile());

			JsonObject json = Json.createObjectBuilder().add("error", errores.getString("errorGenerico")).build();

			response.setContentType("application/json");

			JsonWriter jsonWrtier = Json.createWriter(response.getWriter());

			jsonWrtier.writeObject(json);
			jsonWrtier.close();
		} catch (IOException ioex) {
			logger.fatal(ioex);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
