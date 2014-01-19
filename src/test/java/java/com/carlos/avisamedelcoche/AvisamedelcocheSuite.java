/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.com.carlos.avisamedelcoche;

import com.carlos.avisamedelcoche.AppTest;
import com.carlos.avisamedelcoche.AvisadorTest;
import com.carlos.avisamedelcoche.CocheTest;
import com.carlos.avisamedelcoche.ComponenteTest;
import com.carlos.avisamedelcoche.ComprobadorTest;
import com.carlos.avisamedelcoche.EstadoCocheTest;
import com.carlos.avisamedelcoche.EstadoComponenteTest;
import com.carlos.avisamedelcoche.MensajeTest;
import com.carlos.avisamedelcoche.SistemaTest;
import com.carlos.avisamedelcoche.UsuarioTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class AvisamedelcocheSuite extends TestCase {
    
    public AvisamedelcocheSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("AvisamedelcocheSuite");
        suite.addTest(AppTest.suite());
        suite.addTest(SistemaTest.suite());
        suite.addTest(EstadoCocheTest.suite());
        suite.addTest(CocheTest.suite());
        suite.addTest(AvisadorTest.suite());
        suite.addTest(EstadoComponenteTest.suite());
        suite.addTest(MensajeTest.suite());
        suite.addTest(UsuarioTest.suite());
        suite.addTest(ComprobadorTest.suite());
        suite.addTest(ComponenteTest.suite());
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
    
}
