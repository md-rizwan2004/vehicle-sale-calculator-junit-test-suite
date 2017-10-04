//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.01 at 11:12:39 PM PKT 
//


package dk.semler.ws.vehiclesalecalculator.v201412.calculateusedvehicle.response;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 			
 * 
 * <p>Java class for CALCULATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALCULATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTALPRICE" type="{}PRICEType"/&gt;
 *         &lt;element name="VEHICLESOLDTODEALERPRICE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VEHICLESOLDTODEALERTOTALPRICE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GRANDTOTALPRICE" type="{}PRICEType"/&gt;
 *         &lt;element name="IMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE" type="{}PRICEType"/&gt;
 *         &lt;element name="IMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE" type="{}PRICEType"/&gt;
 *         &lt;element name="DEALEREQUIPMENTTOTALPRICE" type="{}PRICEType"/&gt;
 *         &lt;element name="EQUIPMENTGRANDTOTALPRICE" type="{}PRICEType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CALCULATIONType", propOrder = {
    "totalprice",
    "vehiclesoldtodealerprice",
    "vehiclesoldtodealertotalprice",
    "grandtotalprice",
    "importerdefineddealerequipmenttotalprice",
    "importerdefineddealerequipmenttotallistprice",
    "dealerequipmenttotalprice",
    "equipmentgrandtotalprice"
})
public class CALCULATIONType {

    @XmlElement(name = "TOTALPRICE", required = true)
    protected PRICEType totalprice;
    @XmlElement(name = "VEHICLESOLDTODEALERPRICE", required = true)
    protected BigDecimal vehiclesoldtodealerprice;
    @XmlElement(name = "VEHICLESOLDTODEALERTOTALPRICE", required = true)
    protected BigDecimal vehiclesoldtodealertotalprice;
    @XmlElement(name = "GRANDTOTALPRICE", required = true)
    protected PRICEType grandtotalprice;
    @XmlElement(name = "IMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE", required = true)
    protected PRICEType importerdefineddealerequipmenttotalprice;
    @XmlElement(name = "IMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE", required = true)
    protected PRICEType importerdefineddealerequipmenttotallistprice;
    @XmlElement(name = "DEALEREQUIPMENTTOTALPRICE", required = true)
    protected PRICEType dealerequipmenttotalprice;
    @XmlElement(name = "EQUIPMENTGRANDTOTALPRICE", required = true)
    protected PRICEType equipmentgrandtotalprice;

    /**
     * Gets the value of the totalprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getTOTALPRICE() {
        return totalprice;
    }

    /**
     * Sets the value of the totalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setTOTALPRICE(PRICEType value) {
        this.totalprice = value;
    }

    /**
     * Gets the value of the vehiclesoldtodealerprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVEHICLESOLDTODEALERPRICE() {
        return vehiclesoldtodealerprice;
    }

    /**
     * Sets the value of the vehiclesoldtodealerprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVEHICLESOLDTODEALERPRICE(BigDecimal value) {
        this.vehiclesoldtodealerprice = value;
    }

    /**
     * Gets the value of the vehiclesoldtodealertotalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVEHICLESOLDTODEALERTOTALPRICE() {
        return vehiclesoldtodealertotalprice;
    }

    /**
     * Sets the value of the vehiclesoldtodealertotalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVEHICLESOLDTODEALERTOTALPRICE(BigDecimal value) {
        this.vehiclesoldtodealertotalprice = value;
    }

    /**
     * Gets the value of the grandtotalprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getGRANDTOTALPRICE() {
        return grandtotalprice;
    }

    /**
     * Sets the value of the grandtotalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setGRANDTOTALPRICE(PRICEType value) {
        this.grandtotalprice = value;
    }

    /**
     * Gets the value of the importerdefineddealerequipmenttotalprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getIMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE() {
        return importerdefineddealerequipmenttotalprice;
    }

    /**
     * Sets the value of the importerdefineddealerequipmenttotalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setIMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE(PRICEType value) {
        this.importerdefineddealerequipmenttotalprice = value;
    }

    /**
     * Gets the value of the importerdefineddealerequipmenttotallistprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getIMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE() {
        return importerdefineddealerequipmenttotallistprice;
    }

    /**
     * Sets the value of the importerdefineddealerequipmenttotallistprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setIMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE(PRICEType value) {
        this.importerdefineddealerequipmenttotallistprice = value;
    }

    /**
     * Gets the value of the dealerequipmenttotalprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getDEALEREQUIPMENTTOTALPRICE() {
        return dealerequipmenttotalprice;
    }

    /**
     * Sets the value of the dealerequipmenttotalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setDEALEREQUIPMENTTOTALPRICE(PRICEType value) {
        this.dealerequipmenttotalprice = value;
    }

    /**
     * Gets the value of the equipmentgrandtotalprice property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEType }
     *     
     */
    public PRICEType getEQUIPMENTGRANDTOTALPRICE() {
        return equipmentgrandtotalprice;
    }

    /**
     * Sets the value of the equipmentgrandtotalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEType }
     *     
     */
    public void setEQUIPMENTGRANDTOTALPRICE(PRICEType value) {
        this.equipmentgrandtotalprice = value;
    }

    public CALCULATIONType withTOTALPRICE(PRICEType value) {
        setTOTALPRICE(value);
        return this;
    }

    public CALCULATIONType withVEHICLESOLDTODEALERPRICE(BigDecimal value) {
        setVEHICLESOLDTODEALERPRICE(value);
        return this;
    }

    public CALCULATIONType withVEHICLESOLDTODEALERTOTALPRICE(BigDecimal value) {
        setVEHICLESOLDTODEALERTOTALPRICE(value);
        return this;
    }

    public CALCULATIONType withGRANDTOTALPRICE(PRICEType value) {
        setGRANDTOTALPRICE(value);
        return this;
    }

    public CALCULATIONType withIMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE(PRICEType value) {
        setIMPORTERDEFINEDDEALEREQUIPMENTTOTALPRICE(value);
        return this;
    }

    public CALCULATIONType withIMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE(PRICEType value) {
        setIMPORTERDEFINEDDEALEREQUIPMENTTOTALLISTPRICE(value);
        return this;
    }

    public CALCULATIONType withDEALEREQUIPMENTTOTALPRICE(PRICEType value) {
        setDEALEREQUIPMENTTOTALPRICE(value);
        return this;
    }

    public CALCULATIONType withEQUIPMENTGRANDTOTALPRICE(PRICEType value) {
        setEQUIPMENTGRANDTOTALPRICE(value);
        return this;
    }

}
