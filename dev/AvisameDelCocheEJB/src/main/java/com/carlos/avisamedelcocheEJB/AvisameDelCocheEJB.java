/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcocheejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.carlos.avisamedelcoche.AvisameDelCocheService;
import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochebusiness.EstadoComponente;
import com.carlos.avisamedelcochedao.DAOVehiculo;

/**
 *
 * @author Pakno
 */
@Stateless
public class AvisameDelCocheEJB implements AvisameDelCocheService {

	@EJB
	DAOVehiculo daoVehiculo;

	static final Logger logger = LogManager.getLogger(AvisameDelCocheEJB.class.getName());

	@Override
	public Coche comprobarEstadoVehiculo(String matricula) {
		
		logger.info("Entrando comprobarEstadoVehiculo: "+matricula);

		Coche coche = daoVehiculo.buscarVehiculo(matricula);

		List<EstadoComponente> estadoComponentesNecesitanRaparacion = coche.obtenerComponentesNecesitanReparacion();

		logger.info("Saliendo comprobarEstadoVehiculo: "+matricula);
		
		return coche;

		// if (!estadoComponentesNecesitanRaparacion.isEmpty()) {
		//
		// Avisador.avisarUsuario(coche);
		//
		// }

	}

	@Override
	public void actualizarVehiculo(Coche coche) {

		daoVehiculo.actualizarVehiculo(coche);
	}

	@Override
	public Coche buscarVehiculo(String matricula) {

		Coche coche = daoVehiculo.buscarVehiculo(matricula);

		return coche;
	}

	@Override
	@TransactionAttribute
	public Coche actualizarKilometraje(String matricula, int kilometraje) {

		Coche coche = daoVehiculo.buscarVehiculo(matricula);

		coche.setKilometraje(kilometraje);

		return coche;
	}

	@Override
	public List<Coche> buscarVehiculos(String matricula) {
		return daoVehiculo.buscarVehiculos(matricula);
	}

	@Override
	/**
	 * @throws ExisteCocheRuntimeExcepcion
	 */
	public Coche altaCoche(Coche coche) {

		//Alta en la BD Relacional
		coche = daoVehiculo.altaCoche(coche);

		return coche;
	}

	@Override
	public Coche modificar(Coche coche) {
		daoVehiculo.modificarCoche(coche);

		return coche;
	}
}
