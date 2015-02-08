
package com.carlos.avisamedelcocheclientews.clienteWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.carlos.avisamedelcocheclientews.clienteWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarVehiculo_QNAME = new QName("http://avisamedelcochews.carlos.com/", "buscarVehiculo");
    private final static QName _BuscarVehiculoResponse_QNAME = new QName("http://avisamedelcochews.carlos.com/", "buscarVehiculoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.carlos.avisamedelcocheclientews.clienteWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarVehiculoResponse }
     * 
     */
    public BuscarVehiculoResponse createBuscarVehiculoResponse() {
        return new BuscarVehiculoResponse();
    }

    /**
     * Create an instance of {@link BuscarVehiculo }
     * 
     */
    public BuscarVehiculo createBuscarVehiculo() {
        return new BuscarVehiculo();
    }

    /**
     * Create an instance of {@link EstadoComponente }
     * 
     */
    public EstadoComponente createEstadoComponente() {
        return new EstadoComponente();
    }

    /**
     * Create an instance of {@link Coche }
     * 
     */
    public Coche createCoche() {
        return new Coche();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://avisamedelcochews.carlos.com/", name = "buscarVehiculo")
    public JAXBElement<BuscarVehiculo> createBuscarVehiculo(BuscarVehiculo value) {
        return new JAXBElement<BuscarVehiculo>(_BuscarVehiculo_QNAME, BuscarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://avisamedelcochews.carlos.com/", name = "buscarVehiculoResponse")
    public JAXBElement<BuscarVehiculoResponse> createBuscarVehiculoResponse(BuscarVehiculoResponse value) {
        return new JAXBElement<BuscarVehiculoResponse>(_BuscarVehiculoResponse_QNAME, BuscarVehiculoResponse.class, null, value);
    }

}
