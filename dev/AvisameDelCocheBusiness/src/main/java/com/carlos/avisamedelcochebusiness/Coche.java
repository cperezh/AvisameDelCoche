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

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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

	private int kilometraje;

	@ElementCollection
	@CollectionTable(name = "EstadoComponente", joinColumns = @JoinColumn(name = "matricula") )
	private Collection<EstadoComponente> estadoComponentes;

	public Coche() {

	}

	public static Coche cocheVacio() {

		Coche coche = new Coche();

		coche.setMatricula("");
		coche.setKilometraje(0);
		coche.estadoComponentes = new ArrayList<EstadoComponente>();

		// Ahora inicializo los componentes
		EstadoComponente estadoComponente;
		int i = 0;

		for (Componente Componente : Componente.values()) {

			estadoComponente = new EstadoComponente();
			estadoComponente.setComponente(Componente.values()[i++]);
			coche.estadoComponentes.add(estadoComponente);
		}

		return coche;
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

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Collection<EstadoComponente> getEstadoComponentes() {
		return estadoComponentes;
	}

	public void setEstadoComponentes(Collection<EstadoComponente> estadoComponentes) {
		this.estadoComponentes = estadoComponentes;
	}

}
