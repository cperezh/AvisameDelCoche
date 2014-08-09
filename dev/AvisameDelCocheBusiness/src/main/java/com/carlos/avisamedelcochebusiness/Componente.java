/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

/**
 * Describe componentes de un coche. Cada componente tiene un vida útil antes
 * del cambio, que es lo que indice la propiedad limiteKilometros de cada
 * componente.
 *
 * @author Pakno
 */
public enum Componente {

    NEUMATICOS(10000),
    ACEITE_MOTOR(5000);

    private final int limiteKilometros;

    private Componente(int _limiteKilometros) {
        this.limiteKilometros = _limiteKilometros;
    }

    public int getLimiteKilometros() {
        return limiteKilometros;
    }

}
