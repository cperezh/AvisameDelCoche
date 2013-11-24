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
public class AvisadorTest extends TestCase {
    
    public AvisadorTest(String testName) {
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
     * Test of avisarUsuario method, of class Avisador.
     */
    public void testAvisarUsuario() {
        Avisador.avisarUsuario();
        assertTrue(true);
    }
    
}
