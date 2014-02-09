/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class EstadoComponenteTest extends TestCase {

    public EstadoComponenteTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EstadoComponenteTest.class);
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
     * Test of getUltimaSustituacion method, of class EstadoComponente.
     */
    public void testGetUltimaSustituacion() {
        System.out.println("getUltimaSustituacion");
        int ultimaSustitucion = 100000;
        EstadoComponente instance = new EstadoComponente();
        instance.setUltimaSustitucion(ultimaSustitucion);
        assertEquals(ultimaSustitucion, instance.getUltimaSustitucion());
    }

    /**
     * Test of setUltimaSustituacion method, of class EstadoComponente.
     */
    public void testSetUltimaSustituacion() {
        System.out.println("setUltimaSustituacion");
        int ultimaSustitucion = 100000;
        EstadoComponente instance = new EstadoComponente();
        instance.setUltimaSustitucion(ultimaSustitucion);
        assertEquals(ultimaSustitucion, instance.getUltimaSustitucion());
    }

    /**
     * Test of getComponente method, of class EstadoComponente.
     */
    public void testGetComponente() {
        System.out.println("getComponente");
        EstadoComponente instance = new EstadoComponente();
        Componente expResult = Componente.ACEITE_MOTOR;
        assertEquals(expResult, Componente.valueOf("ACEITE_MOTOR"));

    }

    /**
     * Test of setComponente method, of class EstadoComponente.
     */
    public void testSetComponente() {
        System.out.println("setComponente");
        Componente componente = Componente.ACEITE_MOTOR;
        EstadoComponente instance = new EstadoComponente();
        instance.setComponente(componente);
        assertTrue(instance.getComponente() == Componente.ACEITE_MOTOR);

    }

    /**
     * Test of getUltimaSustitucion method, of class EstadoComponente.
     */
    public void testGetUltimaSustitucion() {
        System.out.println("getUltimaSustitucion");
        EstadoComponente instance = new EstadoComponente();
        instance.setUltimaSustitucion(1000);
        int result = instance.getUltimaSustitucion();
        assertEquals(1000, result);

    }

    /**
     * Test of setUltimaSustitucion method, of class EstadoComponente.
     */
    public void testSetUltimaSustitucion() {
        System.out.println("setUltimaSustitucion");
        int ultimaSustitucion = 2000;
        EstadoComponente instance = new EstadoComponente();
        instance.setUltimaSustitucion(ultimaSustitucion);
        int result = instance.getUltimaSustitucion();
        assertEquals(2000, result);
    }

}
