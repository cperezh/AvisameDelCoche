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
public class MensajeTest extends TestCase {

    public MensajeTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MensajeTest.class);
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
     * Test of getTextoMensaje method, of class Mensaje.
     */
    public void testGetTextoMensaje() {
        String expResult = "mensaje";
        Mensaje instance = new Mensaje();
        instance.setTextoMensaje(expResult);
        String result = instance.getTextoMensaje();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTextoMensaje method, of class Mensaje.
     */
    public void testSetTextoMensaje() {
        String textoMensaje = "mensaje";
        Mensaje instance = new Mensaje();
        instance.setTextoMensaje(textoMensaje);
        String result = instance.getTextoMensaje();
        assertEquals(textoMensaje, result);

    }

}
