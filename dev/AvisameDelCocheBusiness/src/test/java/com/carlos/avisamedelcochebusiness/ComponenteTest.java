/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcochebusiness;

import com.carlos.avisamedelcochebusiness.Componente;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class ComponenteTest extends TestCase {
    
    public ComponenteTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ComponenteTest.class);
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
     * Test of values method, of class Componente.
     */
    public void testValues() {
        System.out.println("values");
        Componente[] result = Componente.values();
        assertEquals(2, result.length);
    }

    /**
     * Test of valueOf method, of class Componente.
     */
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "NEUMATICOS";
        Componente expResult = Componente.NEUMATICOS;
        Componente result = Componente.valueOf(name);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getLimiteKilometros method, of class Componente.
     */
    public void testGetLimiteKilometros() {
        System.out.println("getLimiteKilometros");
        Componente instance = Componente.NEUMATICOS;
        int expResult = 10000;
        int result = instance.getLimiteKilometros();
        assertEquals(expResult, result);
    }
    
}
