/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.List;

/**
 *
 * @author Pakno
 */
class EstadoCoche {

    int kilometraje;
    List<EstadoComponente> estadoComponentes;

    public EstadoCoche() {

    }

    public List<EstadoComponente> getEstadoComponentes() {
        return estadoComponentes;
    }

    public void setEstadoComponentes(List<EstadoComponente> estadoComponentes) {
        this.estadoComponentes = estadoComponentes;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

}
