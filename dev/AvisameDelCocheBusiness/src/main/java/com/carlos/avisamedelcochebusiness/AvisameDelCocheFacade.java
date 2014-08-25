/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;


import java.util.List;
import javax.mail.MessagingException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

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
                //TODO Configurar el log
                BasicConfigurator.configure();
                Logger.getLogger(AvisameDelCocheFacade.class.getName()).info("Entrando");
                Logger.getLogger(AvisameDelCocheFacade.class.getName()).info("Mensaje: "+mensaje.getTextoMensaje());
                Avisador.avisarUsuario(mensaje);
            } catch (MessagingException ex) {
                Logger.getLogger(AvisameDelCocheFacade.class.getName()).info("El info");
            }
        }

    }
}
