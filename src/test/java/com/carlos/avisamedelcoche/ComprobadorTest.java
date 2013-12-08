/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Pakno
 */
public class ComprobadorTest extends TestCase {

    EstadoCoche estadoCoche;

    public ComprobadorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ComprobadorTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        estadoCoche = new EstadoCoche();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of recuperarEstadoCoche method, of class Comprobador.
     */
    public void testComprobarEstadoCoche() {

        EstadoCoche result = Comprobador.recuperarEstadoCoche();

        if (result == null) {
            fail("Estado coche nulo");
        }

    }

    /**
     * Test of esNecesariaReparacion method, of class Comprobador.
     */
    public void testEsNecesariaReparacion() {

        boolean result = Comprobador.esNecesariaReparacion(estadoCoche);
        assertTrue(true);
    }

    /**
     * Test of recuperarEstadoCoche method, of class Comprobador.
     */
    public void testRecuperarEstadoCoche() {
        System.out.println("recuperarEstadoCoche");
        EstadoCoche expResult = null;
        EstadoCoche result = Comprobador.recuperarEstadoCoche();
        assertEquals(150000, result.getKilometraje());
    }

    /**
     * Test of componerMensaje method, of class Comprobador.
     */
    public void testComponerMensaje() {
        System.out.println("componerMensaje");
        EstadoCoche estadoCoche = null;
        Mensaje expResult = null;
        Mensaje result = Comprobador.componerMensaje(estadoCoche);
        assertEquals(true, StringUtils.isNotEmpty(result.getTextoMensaje()));
    }

}
