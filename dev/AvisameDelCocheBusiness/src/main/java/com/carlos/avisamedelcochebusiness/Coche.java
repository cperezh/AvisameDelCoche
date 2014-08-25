/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Pakno
 */
@Entity
@lombok.Data
public class Coche implements Serializable{

    @Id
    protected String matricula;
    
    @Column
    protected int kilometraje;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="matricula")
    protected List<EstadoComponente> estadoComponentes;

    public Coche() {

    }
}
