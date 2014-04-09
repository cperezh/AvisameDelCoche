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
public class Coche {

    protected int kilometraje;
    protected List<EstadoComponente> estadoComponentes;

    public Coche() {

    }
    
    
    public static Coche crearCocheDePrueba() {

        Coche coche = new Coche();

        coche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(139000);

        EstadoComponente estadoAceiteMotor = new EstadoComponente();
        estadoAceiteMotor.setComponente(Componente.ACEITE_MOTOR);
        estadoAceiteMotor.setUltimaSustitucion(144000);

        List<EstadoComponente> estadoComponentes = new ArrayList<>();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);

        coche.setEstadoComponentes(estadoComponentes);

        return coche;

    }

    int getKilometraje() {
        return kilometraje;
    }

    void setKilometraje(int _kilometraje) {
        kilometraje = _kilometraje;
    }

    List<EstadoComponente> getEstadoComponentes() {
        return estadoComponentes;
    }

    void setEstadoComponentes(List<EstadoComponente> _estadoComponentes) {
        estadoComponentes = _estadoComponentes;
    }

}
