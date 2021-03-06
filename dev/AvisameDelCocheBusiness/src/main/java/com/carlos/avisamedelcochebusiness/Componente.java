/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Describe componentes de un coche. Cada componente tiene un vida útil antes
 * del cambio, que es lo que indice la propiedad limiteKilometros de cada
 * componente.
 *
 * @author Pakno
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "Componente.buscarTodosComponentes", query = "SELECT c FROM Componente c ORDER BY c.nombre"),
		@NamedQuery(name = "Componente.buscarComponentes", query = "SELECT c FROM Componente c WHERE c.nombre like :componente ORDER BY c.nombre") 
})
public class Componente implements Serializable {

	@Id
	@Column(name = "ID_COMPONENTE")
	private int idComponente;

	@Column
	public String nombre;

	@Column(name = "KILOMETROS_DURACION")
	private int limiteKilometros;

	private Componente() {

	}

	public int getIdcomponente() {
		return idComponente;
	}

	public void setIdcomponente(int id_componente) {
		this.idComponente = id_componente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLimiteKilometros() {
		return limiteKilometros;
	}

	public void setLimiteKilometros(int limiteKilometros) {
		this.limiteKilometros = limiteKilometros;
	}

}
