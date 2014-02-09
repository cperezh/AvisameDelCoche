/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcoche;

/**
 *
 * @author Pakno
 */
public class EstadoComponente {
    
    private int ultimaSustitucion;
    
    private Componente componente;

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
