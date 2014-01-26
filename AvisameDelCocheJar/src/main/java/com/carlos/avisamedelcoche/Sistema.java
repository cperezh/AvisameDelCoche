/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.List;
import javax.mail.MessagingException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

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
                BasicConfigurator.configure();
                Logger.getLogger(Sistema.class.getName()).info("Entrando");
                Avisador.avisarUsuario(mensaje);
            } catch (MessagingException ex) {
                Logger.getLogger(Sistema.class.getName()).info("El info");
            }
        }

    }
}
