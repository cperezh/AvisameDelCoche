/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pakno
 */
class Comprobador {

    /**
     * Devuelve la lista de componentes del coche que necesitan una reparacion
     *
     * @param estadoComponentes
     * @return
     */
    static List<EstadoComponente> obtenerComponentesNecesitanReparacion(Coche coche) {

        List<EstadoComponente> estadoComponentesNecesitanReparacion = new ArrayList<>();

        for (EstadoComponente estadoComponente : coche.getEstadoComponentes()) {

            if (comprobarComponenteNecesitaReparacion(estadoComponente, coche.getKilometraje())) {
                estadoComponentesNecesitanReparacion.add(estadoComponente);
            }

        }

        return estadoComponentesNecesitanReparacion;
    }

    /**
     * La reparacion de un componente es necesaria si ha alcanzado el limite de
     * kilometros que se pueden hacer con el.
     *
     * Para calcularlo, restamos el kilometraje actual del coche menos el
     * kilometraje de la sustitucion del componente. Si es mayor que el limite
     * de uso del componente, es necesario sustituir el componente.
     * 
     * @param estadoComponente
     * @param kilometrajeCoche
     * @return 
     */
    private static boolean comprobarComponenteNecesitaReparacion(EstadoComponente estadoComponente, int kilometrajeCoche) {
        boolean necesitaReparacion;
        int kilometrosUsoComponente;

        //Obtengo en numero de kilometros que ha hecho el componente
        kilometrosUsoComponente = kilometrajeCoche - estadoComponente.getUltimaSustitucion();
        
        //Compruebo si es mayor que el limite de vida del componente
        necesitaReparacion = kilometrosUsoComponente > estadoComponente.getComponente().getLimiteKilometros();

        return necesitaReparacion;
    }

    static Mensaje componerMensaje(List<EstadoComponente> estadoComponentes) {

        Mensaje mensaje = new Mensaje();
        String textoParcial = "";
        String nuevalinea = System.getProperty("line.separator");

        for (EstadoComponente estadoComponente : estadoComponentes) {

            textoParcial = mensaje.getTextoMensaje().concat(estadoComponente.getComponente().name());

            textoParcial = textoParcial.concat(nuevalinea);

            mensaje.setTextoMensaje(textoParcial);
        }

        mensaje.setTextoMensaje(textoParcial);

        return mensaje;
    }

}
