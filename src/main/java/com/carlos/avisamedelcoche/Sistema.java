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
public class Sistema {

    public static void avisarDeReparacion() {

        EstadoCoche estadoCoche = Comprobador.comprobarEstadoCoche();

        if (Comprobador.esNecesariaReparacion(estadoCoche)) {
            Avisador.avisarUsuario();
        }

    }
}
