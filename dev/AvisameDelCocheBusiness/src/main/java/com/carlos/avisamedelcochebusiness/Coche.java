/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Pakno
 */
@Entity
@lombok.Data
public class Coche implements Serializable{

    @Id
    protected String matricula;
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

}
