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
public class CocheTest extends TestCase {

    public CocheTest(String testName) {
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
     * Test of getEstadoCoche method, of class Coche.
     */
    public void testGetEstadoCoche() {
        
        EstadoCoche result = Coche.getEstadoCoche();

        if (result == null) {
            fail("Estado nulo");
        }

    }

}
