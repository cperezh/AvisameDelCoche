/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochebusiness;

import com.carlos.avisamedelcochebusiness.Usuario;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class UsuarioTest extends TestCase {
    
    public UsuarioTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UsuarioTest.class);
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
     * Test of obtenerEmail method, of class Usuario.
     */
    public void testObtenerEmail() {
        System.out.println("obtenerEmail");
        String expResult = "cperezh@gmail.com";
        String result = Usuario.obtenerEmail();
        assertEquals(expResult, result);
    }
    
}
