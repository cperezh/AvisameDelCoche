/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcoche;

import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class SistemaTest extends TestCase {
    
    Coche coche;
    
    public SistemaTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SistemaTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        inicialiarCoche();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    private void inicialiarCoche() {
        
        coche = new Coche();

        coche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(100000);

        EstadoComponente estadoAceiteMotor = new EstadoComponente();
        estadoAceiteMotor.setComponente(Componente.ACEITE_MOTOR);
        estadoAceiteMotor.setUltimaSustitucion(110000);

        List<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);

        coche.setEstadoComponentes(estadoComponentes);

    }

    /**
     * Test of avisarDeReparacion method, of class Sistema.
     */
    public void testAvisarDeReparacion() throws MessagingException {
      
        Sistema.avisarDeReparacion(coche);
        assertTrue(true);
   }
}
