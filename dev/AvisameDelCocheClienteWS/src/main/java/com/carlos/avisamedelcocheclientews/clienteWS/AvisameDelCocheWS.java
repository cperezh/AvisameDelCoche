
package com.carlos.avisamedelcocheclientews.clienteWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AvisameDelCocheWS", targetNamespace = "http://avisamedelcochews.carlos.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AvisameDelCocheWS {


    /**
     * 
     * @param matricula
     * @return
     *     returns com.carlos.avisamedelcocheclientews.clienteWS.Coche
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarVehiculo", targetNamespace = "http://avisamedelcochews.carlos.com/", className = "com.carlos.avisamedelcocheclientews.clienteWS.BuscarVehiculo")
    @ResponseWrapper(localName = "buscarVehiculoResponse", targetNamespace = "http://avisamedelcochews.carlos.com/", className = "com.carlos.avisamedelcocheclientews.clienteWS.BuscarVehiculoResponse")
    @Action(input = "http://avisamedelcochews.carlos.com/AvisameDelCocheWS/buscarVehiculoRequest", output = "http://avisamedelcochews.carlos.com/AvisameDelCocheWS/buscarVehiculoResponse")
    public Coche buscarVehiculo(
        @WebParam(name = "matricula", targetNamespace = "")
        String matricula);

}
