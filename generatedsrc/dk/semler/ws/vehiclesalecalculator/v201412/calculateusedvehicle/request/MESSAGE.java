//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.01 at 11:12:38 PM PKT 
//


package dk.semler.ws.vehiclesalecalculator.v201412.calculateusedvehicle.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DEALER"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VEHICLEID"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="26"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VEHICLESOLDTODEALER" type="{}VEHICLESOLDTODEALERType" minOccurs="0"/&gt;
 *                   &lt;element name="ECONOMY" type="{}ECONOMYType"/&gt;
 *                   &lt;element name="CALCULATIONTYPE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="CAR"/&gt;
 *                         &lt;enumeration value="VAN_INCL_VAT"/&gt;
 *                         &lt;enumeration value="VAN_EXCL_VAT"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="DTD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="VehicleSaleCalculator" /&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CalculateUsedVehicle" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "MESSAGE")
public class MESSAGE {

    @XmlElement(name = "REQUEST", required = true)
    protected MESSAGE.REQUEST request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link MESSAGE.REQUEST }
     *     
     */
    public MESSAGE.REQUEST getREQUEST() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link MESSAGE.REQUEST }
     *     
     */
    public void setREQUEST(MESSAGE.REQUEST value) {
        this.request = value;
    }

    public MESSAGE withREQUEST(MESSAGE.REQUEST value) {
        setREQUEST(value);
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DEALER"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VEHICLEID"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="26"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VEHICLESOLDTODEALER" type="{}VEHICLESOLDTODEALERType" minOccurs="0"/&gt;
     *         &lt;element name="ECONOMY" type="{}ECONOMYType"/&gt;
     *         &lt;element name="CALCULATIONTYPE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="CAR"/&gt;
     *               &lt;enumeration value="VAN_INCL_VAT"/&gt;
     *               &lt;enumeration value="VAN_EXCL_VAT"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="DTD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="VehicleSaleCalculator" /&gt;
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CalculateUsedVehicle" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dealer",
        "userid",
        "vehicleid",
        "vehiclesoldtodealer",
        "economy",
        "calculationtype"
    })
    public static class REQUEST {

        @XmlElement(name = "DEALER", required = true)
        protected String dealer;
        @XmlElement(name = "USERID", required = true)
        protected String userid;
        @XmlElement(name = "VEHICLEID", required = true)
        protected String vehicleid;
        @XmlElement(name = "VEHICLESOLDTODEALER")
        protected VEHICLESOLDTODEALERType vehiclesoldtodealer;
        @XmlElement(name = "ECONOMY", required = true)
        protected ECONOMYType economy;
        @XmlElement(name = "CALCULATIONTYPE", required = true)
        protected String calculationtype;
        @XmlAttribute(name = "DTD", required = true)
        protected String dtd;
        @XmlAttribute(name = "NAME", required = true)
        protected String name;

        /**
         * Gets the value of the dealer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEALER() {
            return dealer;
        }

        /**
         * Sets the value of the dealer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEALER(String value) {
            this.dealer = value;
        }

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERID() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERID(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the vehicleid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVEHICLEID() {
            return vehicleid;
        }

        /**
         * Sets the value of the vehicleid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVEHICLEID(String value) {
            this.vehicleid = value;
        }

        /**
         * Gets the value of the vehiclesoldtodealer property.
         * 
         * @return
         *     possible object is
         *     {@link VEHICLESOLDTODEALERType }
         *     
         */
        public VEHICLESOLDTODEALERType getVEHICLESOLDTODEALER() {
            return vehiclesoldtodealer;
        }

        /**
         * Sets the value of the vehiclesoldtodealer property.
         * 
         * @param value
         *     allowed object is
         *     {@link VEHICLESOLDTODEALERType }
         *     
         */
        public void setVEHICLESOLDTODEALER(VEHICLESOLDTODEALERType value) {
            this.vehiclesoldtodealer = value;
        }

        /**
         * Gets the value of the economy property.
         * 
         * @return
         *     possible object is
         *     {@link ECONOMYType }
         *     
         */
        public ECONOMYType getECONOMY() {
            return economy;
        }

        /**
         * Sets the value of the economy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ECONOMYType }
         *     
         */
        public void setECONOMY(ECONOMYType value) {
            this.economy = value;
        }

        /**
         * Gets the value of the calculationtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCULATIONTYPE() {
            return calculationtype;
        }

        /**
         * Sets the value of the calculationtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCULATIONTYPE(String value) {
            this.calculationtype = value;
        }

        /**
         * Gets the value of the dtd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDTD() {
            if (dtd == null) {
                return "VehicleSaleCalculator";
            } else {
                return dtd;
            }
        }

        /**
         * Sets the value of the dtd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDTD(String value) {
            this.dtd = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            if (name == null) {
                return "CalculateUsedVehicle";
            } else {
                return name;
            }
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        public MESSAGE.REQUEST withDEALER(String value) {
            setDEALER(value);
            return this;
        }

        public MESSAGE.REQUEST withUSERID(String value) {
            setUSERID(value);
            return this;
        }

        public MESSAGE.REQUEST withVEHICLEID(String value) {
            setVEHICLEID(value);
            return this;
        }

        public MESSAGE.REQUEST withVEHICLESOLDTODEALER(VEHICLESOLDTODEALERType value) {
            setVEHICLESOLDTODEALER(value);
            return this;
        }

        public MESSAGE.REQUEST withECONOMY(ECONOMYType value) {
            setECONOMY(value);
            return this;
        }

        public MESSAGE.REQUEST withCALCULATIONTYPE(String value) {
            setCALCULATIONTYPE(value);
            return this;
        }

        public MESSAGE.REQUEST withDTD(String value) {
            setDTD(value);
            return this;
        }

        public MESSAGE.REQUEST withNAME(String value) {
            setNAME(value);
            return this;
        }

    }

}
