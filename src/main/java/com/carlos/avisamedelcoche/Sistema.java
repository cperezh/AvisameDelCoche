/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.List;
import javax.mail.MessagingException;

/**
 *
 * @author Pakno
 */
public class Sistema {

    static void avisarDeReparacion(Coche coche) throws MessagingException {

        List<EstadoComponente> estadoComponentesNecesitanRaparacion;

        estadoComponentesNecesitanRaparacion = Comprobador.obtenerComponentesNecesitanReparacion(coche);

        if (!estadoComponentesNecesitanRaparacion.isEmpty()) {
            
            Mensaje mensaje = Comprobador.componerMensaje(estadoComponentesNecesitanRaparacion);
            
            Avisador.avisarUsuario(mensaje);
        }

    }
}
