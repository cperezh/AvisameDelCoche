/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

/**
 *
 * @author Pakno
 */
public class Sistema {

    public static void avisarDeReparacion(Coche coche)  {

        List<EstadoComponente> estadoComponentesNecesitanRaparacion;

        estadoComponentesNecesitanRaparacion = Comprobador.obtenerComponentesNecesitanReparacion(coche);

        if (!estadoComponentesNecesitanRaparacion.isEmpty()) {
            
            Mensaje mensaje = Comprobador.componerMensaje(estadoComponentesNecesitanRaparacion);
            try {
                Avisador.avisarUsuario(mensaje);
            } catch (MessagingException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
