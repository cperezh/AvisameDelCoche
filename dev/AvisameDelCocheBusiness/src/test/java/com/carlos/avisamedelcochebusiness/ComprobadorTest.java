/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.avisamedelcochebusiness;

import com.carlos.avisamedelcochebusiness.Coche;
import com.carlos.avisamedelcochebusiness.Componente;
import com.carlos.avisamedelcochebusiness.EstadoComponente;
import com.carlos.avisamedelcochebusiness.Comprobador;
import com.carlos.avisamedelcochebusiness.Mensaje;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Pakno
 */
public class ComprobadorTest extends TestCase {

    public ComprobadorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ComprobadorTest.class);
        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        inicialiarCoche();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private void inicialiarCoche() {

    }

    /**
     * Test of componerMensaje method, of class Comprobador.
     */
    public void testComponerMensaje() {
       
        Coche coche = new Coche();

        coche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(139000);

        EstadoComponente estadoAceiteMotor = new EstadoComponente();
        estadoAceiteMotor.setComponente(Componente.ACEITE_MOTOR);
        estadoAceiteMotor.setUltimaSustitucion(145000);

        List<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);

        coche.setEstadoComponentes(estadoComponentes);
        
        Mensaje mensaje = Comprobador.componerMensaje(estadoComponentes);
        
        assertEquals(true, !mensaje.getTextoMensaje().isEmpty());
    }

    /**
     * Test of obtenerComponentesNecesitanReparacion method, of class
     * Comprobador.
     */
    public void testObtenerComponentesNecesitanReparacion() {
        System.out.println("obtenerComponentesNecesitanReparacion");

        Coche coche = new Coche();

        coche.setKilometraje(150000);

        EstadoComponente estadoNeumaticos = new EstadoComponente();
        estadoNeumaticos.setComponente(Componente.NEUMATICOS);
        estadoNeumaticos.setUltimaSustitucion(139000);

        EstadoComponente estadoAceiteMotor = new EstadoComponente();
        estadoAceiteMotor.setComponente(Componente.ACEITE_MOTOR);
        estadoAceiteMotor.setUltimaSustitucion(145000);

        List<EstadoComponente> estadoComponentes = new ArrayList();
        estadoComponentes.add(estadoNeumaticos);
        estadoComponentes.add(estadoAceiteMotor);

        coche.setEstadoComponentes(estadoComponentes);

        List<EstadoComponente> result = Comprobador.obtenerComponentesNecesitanReparacion(coche);

        assertEquals(Componente.NEUMATICOS, result.get(0).getComponente());

    }

}
