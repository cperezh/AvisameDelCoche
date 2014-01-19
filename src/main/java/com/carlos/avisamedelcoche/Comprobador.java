/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pakno
 */
class Comprobador {

    /**
     * La reparación de un componente es necesaria si ha alcanzado el límite de
     * kilómetros que se pueden hacer con él.
     *
     * Para calcularlo, restamos el kilometraje actual del coche menos el
     * kilometraje de la sustitución del componente. Si es mayor que el límite
     * de uso del componente, es necesario sustituir el componente.
     *
     * @param estadoComponentes
     * @return
     */
    static List<EstadoComponente> obtenerComponentesNecesitanReparacion(Coche coche) {

        int kilometrosUsoComponente;
        List<EstadoComponente> estadoComponentesNecesitanReparacion = new ArrayList<>();

        for (EstadoComponente estadoComponente : coche.getEstadoComponentes()) {
            
            kilometrosUsoComponente = coche.getKilometraje() - estadoComponente.getUltimaSustitucion();
            
            if (kilometrosUsoComponente > estadoComponente.getComponente().getLimiteKilometros()){
                estadoComponentesNecesitanReparacion.add(estadoComponente);
            }
        }
        
        return estadoComponentesNecesitanReparacion;
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
