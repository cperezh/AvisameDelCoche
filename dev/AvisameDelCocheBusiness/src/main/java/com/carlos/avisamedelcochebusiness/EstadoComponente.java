/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochebusiness;

/**
 *
 * @author Pakno
 */
class EstadoComponente {
    
    private int ultimaSustitucion;
    
    private Componente componente;

    EstadoComponente() {
    }

    int getUltimaSustitucion() {
        return ultimaSustitucion;
    }

    void setUltimaSustitucion(int ultimaSustitucion) {
        this.ultimaSustitucion = ultimaSustitucion;
    }

    Componente getComponente() {
        return componente;
    }

    void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    
}
