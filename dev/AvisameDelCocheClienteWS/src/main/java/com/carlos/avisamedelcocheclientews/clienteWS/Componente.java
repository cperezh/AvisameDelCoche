
package com.carlos.avisamedelcocheclientews.clienteWS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para componente.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="componente">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEUMATICOS"/>
 *     &lt;enumeration value="ACEITE_MOTOR"/>
 *     &lt;enumeration value="FILTRO_ACEITE"/>
 *     &lt;enumeration value="FILTRO_AIRE"/>
 *     &lt;enumeration value="FILTRO_HABITACULO"/>
 *     &lt;enumeration value="FILTRO_COMBUSTIBLE"/>
 *     &lt;enumeration value="LIQUIDO_FRENOS"/>
 *     &lt;enumeration value="PASTILLAS_FRENO"/>
 *     &lt;enumeration value="DISCO_FRENO"/>
 *     &lt;enumeration value="ALINEAR_DIRECCION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "componente")
@XmlEnum
public enum Componente {

    NEUMATICOS,
    ACEITE_MOTOR,
    FILTRO_ACEITE,
    FILTRO_AIRE,
    FILTRO_HABITACULO,
    FILTRO_COMBUSTIBLE,
    LIQUIDO_FRENOS,
    PASTILLAS_FRENO,
    DISCO_FRENO,
    ALINEAR_DIRECCION;

    public String value() {
        return name();
    }

    public static Componente fromValue(String v) {
        return valueOf(v);
    }

}
