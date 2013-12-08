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
class Comprobador {

    static EstadoCoche recuperarEstadoCoche() {

        EstadoCoche estadoCoche = Coche.getEstadoCoche();

        return estadoCoche;
    }

    static boolean esNecesariaReparacion(EstadoCoche estadoCoche) {
        return true;
    }

    static Mensaje componerMensaje(EstadoCoche estadoCoche) {
        Mensaje mensaje = new Mensaje();
        
        mensaje.setTextoMensaje("Prueba");
        
        return mensaje;
    }

}
