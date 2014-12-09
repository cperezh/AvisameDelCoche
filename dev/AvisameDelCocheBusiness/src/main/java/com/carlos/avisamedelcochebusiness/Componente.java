/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;

/**
 * Describe componentes de un coche. Cada componente tiene un vida útil antes
 * del cambio, que es lo que indice la propiedad limiteKilometros de cada
 * componente.
 *
 * @author Pakno
 */
public enum Componente implements Serializable{

    NEUMATICOS(20000),
    ACEITE_MOTOR(15000),
    FILTRO_ACEITE(15000),
    FILTRO_AIRE(30000),
    FILTRO_HABITACULO(10000),
    FILTRO_COMBUSTIBLE(30000),
    LIQUIDO_FRENOS(30000),
    PASTILLAS_FRENO(15000),
    DISCO_FRENO(30000),
    ALINEAR_DIRECCION(20000);
    

    private final int limiteKilometros;

    private Componente(int _limiteKilometros) {
        this.limiteKilometros = _limiteKilometros;
    }

    public int getLimiteKilometros() {
        return limiteKilometros;
    }

}
