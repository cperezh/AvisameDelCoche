/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Pakno
 */
@Entity
public class EstadoComponente implements Serializable {

    @Id
    private Componente componente;

    @Column
    private int ultimaSustitucion;

    public EstadoComponente() {

    }

    public int getUltimaSustitucion() {
        return ultimaSustitucion;
    }

    public void setUltimaSustitucion(int ultimaSustitucion) {
        this.ultimaSustitucion = ultimaSustitucion;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

}
