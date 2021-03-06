/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 *
 * @author Pakno
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Coche.buscarCochesPorMatricula", query = "SELECT c FROM Coche c WHERE c.matricula like :matricula") })
public class Coche implements Serializable {

	@Id
	private String matricula;

	private Integer kilometraje;

	@OneToMany(mappedBy = "coche")
	@OrderBy("ultimaSustitucion")
	private Collection<EstadoComponente> estadoComponentes;

	public Coche() {

	}
	
	

	/**
	 * La reparacion de un componente es necesaria si ha alcanzado el limite de
	 * kilometros que se pueden hacer con el.
	 *
	 * Para calcularlo, restamos el kilometraje actual del coche menos el
	 * kilometraje de la sustitucion del componente. Si es mayor que el limite
	 * de uso del componente, es necesario sustituir el componente.
	 * 
	 */
	private void comprobarComponenteNecesitaReparacion() {

		int kilometrosUsoComponente;
		int kilometrosDeMasComponente;
		boolean necesitaReparacion;

		for (EstadoComponente estadoComponente : this.getEstadoComponentes()) {

			kilometrosUsoComponente = this.kilometraje - estadoComponente.getUltimaSustitucion();

			kilometrosDeMasComponente = kilometrosUsoComponente
					- estadoComponente.getComponente().getLimiteKilometros();

			necesitaReparacion = kilometrosDeMasComponente > 0;

			estadoComponente.setKilometrosDeMas(kilometrosDeMasComponente);

			estadoComponente.setNecesitaReparacion(necesitaReparacion);
		}

	}

	public List<EstadoComponente> obtenerComponentesNecesitanReparacion() {

		List<EstadoComponente> estadoComponentesNecesitanReparacion = new ArrayList<>();

		this.comprobarComponenteNecesitaReparacion();

		for (EstadoComponente estadoComponente : this.getEstadoComponentes()) {

			if (estadoComponente.isNecesitaReparacion()) {
				estadoComponentesNecesitanReparacion.add(estadoComponente);
			}

		}

		return estadoComponentesNecesitanReparacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Collection<EstadoComponente> getEstadoComponentes() {
		return estadoComponentes;
	}

	public void setEstadoComponentes(Collection<EstadoComponente> estadoComponentes) {
		this.estadoComponentes = estadoComponentes;
	}

}
