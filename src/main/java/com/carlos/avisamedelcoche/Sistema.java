/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import javax.mail.MessagingException;

/**
 *
 * @author Pakno
 */
public class Sistema {

    public static void avisarDeReparacion() throws MessagingException {

        EstadoCoche estadoCoche = Comprobador.recuperarEstadoCoche();

        if (Comprobador.esNecesariaReparacion(estadoCoche)) {
            
            Mensaje mensaje = Comprobador.componerMensaje(estadoCoche);
            
            Avisador.avisarUsuario(mensaje);
        }

    }
}
