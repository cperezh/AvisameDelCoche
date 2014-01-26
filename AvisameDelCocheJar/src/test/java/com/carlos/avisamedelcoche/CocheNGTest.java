/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.avisamedelcoche;

import java.util.List;
import static org.testng.Assert.*;

/**
 *
 * @author Pakno
 */
public class CocheNGTest {
    
    public CocheNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getKilometraje method, of class Coche.
     */
    @org.testng.annotations.Test
    public void testGetKilometraje() {
        System.out.println("getKilometraje");
        Coche instance = new Coche();
        int expResult = 0;
        int result = instance.getKilometraje();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKilometraje method, of class Coche.
     */
    @org.testng.annotations.Test
    public void testSetKilometraje() {
        System.out.println("setKilometraje");
        int _kilometraje = 0;
        Coche instance = new Coche();
        instance.setKilometraje(_kilometraje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoComponentes method, of class Coche.
     */
    @org.testng.annotations.Test
    public void testGetEstadoComponentes() {
        System.out.println("getEstadoComponentes");
        Coche instance = new Coche();
        List expResult = null;
        List result = instance.getEstadoComponentes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoComponentes method, of class Coche.
     */
    @org.testng.annotations.Test
    public void testSetEstadoComponentes() {
        System.out.println("setEstadoComponentes");
        List<EstadoComponente> _estadoComponentes = null;
        Coche instance = new Coche();
        instance.setEstadoComponentes(_estadoComponentes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
