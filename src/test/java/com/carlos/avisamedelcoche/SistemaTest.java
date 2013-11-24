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
public class SistemaTest extends TestCase {
    
    public SistemaTest(String testName) {
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
     * Test of avisarDeReparacion method, of class Sistema.
     */
    public void testAvisarDeReparacion() {
        Sistema.avisarDeReparacion();
        assertTrue(true);
   }
}
