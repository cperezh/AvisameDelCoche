/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Pakno
 */
@Entity
public class EstadoComponente implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "MATRICULA")
	private Coche coche;

	@Id
	@ManyToOne
	@JoinColumn(name = "ID_COMPONENTE")
	private Componente componente;

	private Integer ultimaSustitucion;

	@Transient
	private Integer kilometrosDeMas;

	@Transient
	private Boolean necesitaReparacion;

	public EstadoComponente() {

	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	public Integer getUltimaSustitucion() {
		return ultimaSustitucion;
	}

	public void setUltimaSustitucion(Integer ultimaSustitucion) {
		this.ultimaSustitucion = ultimaSustitucion;
	}

	public Boolean isNecesitaReparacion() {
		return necesitaReparacion;
	}

	public void setNecesitaReparacion(Boolean necesitaReparacion) {
		this.necesitaReparacion = necesitaReparacion;
	}

	public Integer getKilometrosDeMas() {
		return kilometrosDeMas;
	}

	public void setKilometrosDeMas(Integer kilometrosDeMas) {
		this.kilometrosDeMas = kilometrosDeMas;
	}

}
