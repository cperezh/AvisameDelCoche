/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import java.util.Collection;
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
    @NamedQuery(name = "Coche.buscarCochesPorMatricula",
            query = "SELECT c FROM Coche c WHERE c.matricula like :matricula")
})
public class Coche implements Serializable {

    @Id
    protected String matricula;

    protected int kilometraje;

    @ElementCollection
    @CollectionTable(name = "EstadoComponente", joinColumns = @JoinColumn(name = "matricula"))
    protected Collection<EstadoComponente> estadoComponentes;

    public Coche() {

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
