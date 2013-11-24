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
public class EstadoCocheTest extends TestCase {

    public EstadoCocheTest(String testName) {
        super(testName);
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

    

}
