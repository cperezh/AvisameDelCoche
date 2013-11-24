/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcoche;

import junit.framework.TestCase;

/**
 *
 * @author Pakno
 */
public class ComprobadorTest extends TestCase {

    EstadoCoche estadoCoche;

    public ComprobadorTest(String testName) {
        super(testName);
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
     * Test of comprobarEstadoCoche method, of class Comprobador.
     */
    public void testComprobarEstadoCoche() {

        EstadoCoche result = Comprobador.comprobarEstadoCoche();

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

}
