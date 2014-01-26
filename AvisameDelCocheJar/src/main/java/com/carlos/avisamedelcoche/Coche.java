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
public class Coche {

    private int kilometraje;
    private List<EstadoComponente> estadoComponentes;

    public Coche() {

    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int _kilometraje) {
        kilometraje = _kilometraje;
    }

    public List<EstadoComponente> getEstadoComponentes() {
        return estadoComponentes;
    }

    public void setEstadoComponentes(List<EstadoComponente> _estadoComponentes) {
        estadoComponentes = _estadoComponentes;
    }

}
