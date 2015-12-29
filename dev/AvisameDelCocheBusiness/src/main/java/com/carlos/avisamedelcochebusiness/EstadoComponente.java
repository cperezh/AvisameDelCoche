/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 *
 * @author Pakno
 */
@Embeddable
public class EstadoComponente implements Serializable {

	private Componente componente;
	

    private int ultimaSustitucion;
    
    @Transient
    private int kilometrosDeMas;
    
    @Transient
	private boolean necesitaReparacion;

    public EstadoComponente() {

    }

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

	public int getUltimaSustitucion() {
		return ultimaSustitucion;
	}

	public void setUltimaSustitucion(int ultimaSustitucion) {
		this.ultimaSustitucion = ultimaSustitucion;
	}

	public boolean isNecesitaReparacion() {
		return necesitaReparacion;
	}

	public void setNecesitaReparacion(boolean necesitaReparacion) {
		this.necesitaReparacion = necesitaReparacion;
	}

	public int getKilometrosDeMas() {
		return kilometrosDeMas;
	}

	public void setKilometrosDeMas(int kilometrosDeMas) {
		this.kilometrosDeMas = kilometrosDeMas;
	}
	
	
	

}
