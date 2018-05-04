//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.04 um 03:36:52 PM CEST 
//


package de.ite.dus.pfc.power.importer.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für CalibrationCurveType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalibrationCurveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="D" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}DateWithPricesType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="country" use="required" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}CountryIso3166Alpha2Type" />
 *       &lt;attribute name="eetTimestamp" use="required" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}TimeStampType" />
 *       &lt;attribute name="marketPostfix" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tradeDate" use="required" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}TimeStampType" />
 *       &lt;attribute name="granularity" use="required" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}GranularityType" />
 *       &lt;attribute name="unit" use="required" type="{http://www.eon.com/pegasus/calibrationcurve/version/1/0}UnitType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalibrationCurveType", propOrder = {
    "d"
})
public class CalibrationCurveType {

    @XmlElement(name = "D")
    protected List<DateWithPricesType> d;
    @XmlAttribute(name = "country", required = true)
    protected CountryIso3166Alpha2Type country;
    @XmlAttribute(name = "eetTimestamp", required = true)
    protected XMLGregorianCalendar eetTimestamp;
    @XmlAttribute(name = "marketPostfix", required = true)
    protected String marketPostfix;
    @XmlAttribute(name = "tradeDate", required = true)
    protected XMLGregorianCalendar tradeDate;
    @XmlAttribute(name = "granularity", required = true)
    protected GranularityType granularity;
    @XmlAttribute(name = "unit", required = true)
    protected UnitType unit;

    /**
     * Gets the value of the d property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateWithPricesType }
     * 
     * 
     */
    public List<DateWithPricesType> getD() {
        if (d == null) {
            d = new ArrayList<DateWithPricesType>();
        }
        return this.d;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryIso3166Alpha2Type }
     *     
     */
    public CountryIso3166Alpha2Type getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIso3166Alpha2Type }
     *     
     */
    public void setCountry(CountryIso3166Alpha2Type value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der eetTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEetTimestamp() {
        return eetTimestamp;
    }

    /**
     * Legt den Wert der eetTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEetTimestamp(XMLGregorianCalendar value) {
        this.eetTimestamp = value;
    }

    /**
     * Ruft den Wert der marketPostfix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPostfix() {
        return marketPostfix;
    }

    /**
     * Legt den Wert der marketPostfix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPostfix(String value) {
        this.marketPostfix = value;
    }

    /**
     * Ruft den Wert der tradeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeDate() {
        return tradeDate;
    }

    /**
     * Legt den Wert der tradeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeDate(XMLGregorianCalendar value) {
        this.tradeDate = value;
    }

    /**
     * Ruft den Wert der granularity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GranularityType }
     *     
     */
    public GranularityType getGranularity() {
        return granularity;
    }

    /**
     * Legt den Wert der granularity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GranularityType }
     *     
     */
    public void setGranularity(GranularityType value) {
        this.granularity = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnit(UnitType value) {
        this.unit = value;
    }

}
