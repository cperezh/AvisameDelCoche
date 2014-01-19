package com.carlos.avisamedelcoche;

import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws MessagingException {
        Coche coche = crearCocheDePrueba();
        Sistema.avisarDeReparacion(coche);
    }
    
    private static Coche crearCocheDePrueba() {
        
        Coche coche = new Coche();
        
        coche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(139000);
        
        EstadoComponente estadoAceiteMotor = new EstadoComponente();
        estadoAceiteMotor.setComponente(Componente.ACEITE_MOTOR);
        estadoAceiteMotor.setUltimaSustitucion(144000);

        List<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);
        
        coche.setEstadoComponentes(estadoComponentes);
        
        return coche;

    }
}
