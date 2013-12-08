/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.ArrayList;

/**
 *
 * @author Pakno
 */
class Coche {

    private static EstadoCoche estadoCoche;

    static {
        crearCocheDePrueba();
    }

    private static void crearCocheDePrueba() {
        estadoCoche = new EstadoCoche();
        estadoCoche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(100000);

        ArrayList<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);

        estadoCoche.setEstadoComponentes(estadoComponentes);
    }

    static EstadoCoche getEstadoCoche() {
        return estadoCoche;
    }

}
