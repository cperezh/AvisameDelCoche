
package com.carlos.avisamedelcocheclientews.clienteWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para coche complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoComponentes" type="{http://avisamedelcochews.carlos.com/}estadoComponente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kilometraje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coche", propOrder = {
    "estadoComponentes",
    "kilometraje",
    "matricula"
})
public class Coche {

    @XmlElement(nillable = true)
    protected List<EstadoComponente> estadoComponentes;
    protected int kilometraje;
    protected String matricula;

    /**
     * Gets the value of the estadoComponentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estadoComponentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadoComponentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstadoComponente }
     * 
     * 
     */
    public List<EstadoComponente> getEstadoComponentes() {
        if (estadoComponentes == null) {
            estadoComponentes = new ArrayList<EstadoComponente>();
        }
        return this.estadoComponentes;
    }

    /**
     * Obtiene el valor de la propiedad kilometraje.
     * 
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * Define el valor de la propiedad kilometraje.
     * 
     */
    public void setKilometraje(int value) {
        this.kilometraje = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

}
