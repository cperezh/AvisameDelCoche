/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochers.beans;

import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochebusiness.EstadoComponente;
import java.util.Collection;
import javax.ws.rs.FormParam;

/**
 *
 * @author Carlos
 */
public class CocheBean {

    @FormParam("matricula")
    protected String matricula;

    @FormParam("kilometraje")
    protected int kilometraje;

    @FormParam("estadoComponentes")
    protected Collection<EstadoComponente> estadoComponentes;
    
    public Coche toCoche(){
        Coche coche = new Coche();
        
        coche.setMatricula(this.matricula);
        coche.setKilometraje(this.kilometraje);
        coche.setEstadoComponentes(this.estadoComponentes);
        
        return coche;
    }
}
