/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class CocheTest extends TestCase {

    Coche coche;

    public CocheTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CocheTest.class);
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
        estadoAceiteMotor.setUltimaSustitucion(144000);

        List<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);

        coche.setEstadoComponentes(estadoComponentes);

    }

    /**
     * Test of getKilometraje method, of class Coche.
     */
    public void testGetKilometraje() {
        System.out.println("getKilometraje");

        assertEquals(150000, coche.getKilometraje());

    }

    /**
     * Test of setKilometraje method, of class Coche.
     */
    public void testSetKilometraje() {
        coche.setKilometraje(140000);

        assertEquals(140000, coche.getKilometraje());
    }

    /**
     * Test of getEstadoComponentes method, of class Coche.
     */
    public void testGetEstadoComponentes() {

        List<EstadoComponente> result = coche.getEstadoComponentes();
        assertEquals(true, !result.isEmpty());

    }

    /**
     * Test of setEstadoComponentes method, of class Coche.
     */
    public void testSetEstadoComponentes() {
        System.out.println("setEstadoComponentes");

        List<EstadoComponente> estadoComponentes = new ArrayList<>();
        EstadoComponente estadoComponente = new EstadoComponente();
        estadoComponente.setComponente(Componente.ACEITE_MOTOR);
        estadoComponente.setUltimaSustitucion(10000);
        estadoComponentes.add(estadoComponente);
        coche.setEstadoComponentes(estadoComponentes);

        List<EstadoComponente> result = coche.getEstadoComponentes();
        estadoComponente = result.get(0);
        assertEquals(10000, estadoComponente.getUltimaSustitucion());

    }

}
