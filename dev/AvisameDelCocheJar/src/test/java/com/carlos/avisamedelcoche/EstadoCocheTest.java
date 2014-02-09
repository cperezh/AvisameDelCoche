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
public class EstadoCocheTest extends TestCase {

    public EstadoCocheTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EstadoCocheTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getKilometraje method, of class EstadoCoche.
     */
    public void testGetKilometraje() {

        EstadoCoche instance = new EstadoCoche();

        double result = instance.getKilometraje();

        if (result < 0) {
            fail("Kilometraje negativo");
        }
    }

    /**
     * Test of setEstadoComponentes method, of class EstadoCoche.
     */
    public void testSetEstadoComponentes() {
        System.out.println("setEstadoComponentes");
        List<EstadoComponente> estadoComponentes = new ArrayList<>();
        EstadoCoche instance = new EstadoCoche();
        instance.setEstadoComponentes(estadoComponentes);

        assertEquals(estadoComponentes, instance.getEstadoComponentes());

    }

    /**
     * Test of setKilometraje method, of class EstadoCoche.
     */
    public void testSetKilometraje() {
        System.out.println("setKilometraje");
        int kilometraje = 100000;
        EstadoCoche instance = new EstadoCoche();
        instance.setKilometraje(kilometraje);
        assertEquals(kilometraje, instance.getKilometraje());
    }
}
