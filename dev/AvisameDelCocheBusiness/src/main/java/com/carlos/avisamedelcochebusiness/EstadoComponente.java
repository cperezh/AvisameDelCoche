/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Pakno
 */
@Embeddable
@lombok.Data
public class EstadoComponente implements Serializable {

    private Componente componente;

    private int ultimaSustitucion;

    public EstadoComponente() {

    }

}
