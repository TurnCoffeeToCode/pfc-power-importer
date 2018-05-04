//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.04 um 03:36:52 PM CEST 
//


package de.ite.dus.pfc.power.importer.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CountryIso3166Alpha2Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryIso3166Alpha2Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryIso3166Alpha2Type")
@XmlEnum
public enum CountryIso3166Alpha2Type {

    AT,
    BE,
    CH,
    DE,
    DK,
    FR,
    IT,
    LI,
    LU;

    public String value() {
        return name();
    }

    public static CountryIso3166Alpha2Type fromValue(String v) {
        return valueOf(v);
    }

}
