//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.04 um 03:36:52 PM CEST 
//


package de.ite.dus.pfc.power.importer.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Curve" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}CalibrationCurveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calibrationCurve"
})
@XmlRootElement(name = "hFC_endOfDay")
public class HFCEndOfDay {

    @XmlElement(name = "Curve", required = true)
    protected CalibrationCurveType calibrationCurve;

    /**
     * Ruft den Wert der calibrationCurve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalibrationCurveType }
     *     
     */
    public CalibrationCurveType getCalibrationCurve() {
        return calibrationCurve;
    }

    /**
     * Legt den Wert der calibrationCurve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalibrationCurveType }
     *     
     */
    public void setCalibrationCurve(CalibrationCurveType value) {
        this.calibrationCurve = value;
    }

}
