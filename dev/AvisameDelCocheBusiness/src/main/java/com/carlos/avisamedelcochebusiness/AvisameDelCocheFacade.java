/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;


import java.util.List;
import javax.mail.MessagingException;
import org.apache.logging.log4j.LogManager;


/**
 *
 * @author Pakno
 */
public class AvisameDelCocheFacade {

    public static void comprobarEstadoVehiculo(Coche coche)  {

        List<EstadoComponente> estadoComponentesNecesitanRaparacion;

        estadoComponentesNecesitanRaparacion = Comprobador.obtenerComponentesNecesitanReparacion(coche);

        if (!estadoComponentesNecesitanRaparacion.isEmpty()) {
            
            Mensaje mensaje = Comprobador.componerMensaje(estadoComponentesNecesitanRaparacion);
            
            try {
              
                LogManager.getLogger(AvisameDelCocheFacade.class.getName()).info("Entrando");
                LogManager.getLogger(AvisameDelCocheFacade.class.getName()).info("Mensaje: "+mensaje.getTextoMensaje());
                Avisador.avisarUsuario(mensaje);
            } catch (MessagingException ex) {
                LogManager.getLogger(AvisameDelCocheFacade.class.getName()).info("El info");
            }
        }

    }
}
