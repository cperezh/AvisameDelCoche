
package com.carlos.avisamedelcocheclientews.clienteWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoComponente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estadoComponente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componente" type="{http://avisamedelcochews.carlos.com/}componente" minOccurs="0"/>
 *         &lt;element name="ultimaSustitucion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoComponente", propOrder = {
    "componente",
    "ultimaSustitucion"
})
public class EstadoComponente {

    protected Componente componente;
    protected int ultimaSustitucion;

    /**
     * Obtiene el valor de la propiedad componente.
     * 
     * @return
     *     possible object is
     *     {@link Componente }
     *     
     */
    public Componente getComponente() {
        return componente;
    }

    /**
     * Define el valor de la propiedad componente.
     * 
     * @param value
     *     allowed object is
     *     {@link Componente }
     *     
     */
    public void setComponente(Componente value) {
        this.componente = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaSustitucion.
     * 
     */
    public int getUltimaSustitucion() {
        return ultimaSustitucion;
    }

    /**
     * Define el valor de la propiedad ultimaSustitucion.
     * 
     */
    public void setUltimaSustitucion(int value) {
        this.ultimaSustitucion = value;
    }

}
