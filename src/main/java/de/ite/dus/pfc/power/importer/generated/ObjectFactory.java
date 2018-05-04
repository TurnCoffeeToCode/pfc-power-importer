//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.04 um 03:36:52 PM CEST 
//


package de.ite.dus.pfc.power.importer.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.ite.dus.pfc.power.importer.generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.ite.dus.pfc.power.importer.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HFCEndOfDay }
     * 
     */
    public HFCEndOfDay createHFCEndOfDay() {
        return new HFCEndOfDay();
    }

    /**
     * Create an instance of {@link CalibrationCurveType }
     * 
     */
    public CalibrationCurveType createCalibrationCurveType() {
        return new CalibrationCurveType();
    }

    /**
     * Create an instance of {@link DateWithPricesType }
     * 
     */
    public DateWithPricesType createDateWithPricesType() {
        return new DateWithPricesType();
    }

    /**
     * Create an instance of {@link PricePerTimeType }
     * 
     */
    public PricePerTimeType createPricePerTimeType() {
        return new PricePerTimeType();
    }

}
