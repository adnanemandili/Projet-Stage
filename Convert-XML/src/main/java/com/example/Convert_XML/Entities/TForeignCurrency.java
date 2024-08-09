//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.04 at 10:06:44 PM WEST 
//


package com.example.Convert_XML.Entities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t_foreign_currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_foreign_currency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foreign_currency_code" type="{}currency_type"/>
 *         &lt;element name="foreign_amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foreign_exchange_rate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_foreign_currency", propOrder = {
    "foreignCurrencyCode",
    "foreignAmount",
    "foreignExchangeRate"
})
public class TForeignCurrency {

    @XmlElement(name = "foreign_currency_code", required = true)
    protected String foreignCurrencyCode;
    @XmlElement(name = "foreign_amount", required = true)
    protected BigDecimal foreignAmount;
    @XmlElement(name = "foreign_exchange_rate", required = true)
    protected BigDecimal foreignExchangeRate;

    /**
     * Gets the value of the foreignCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCurrencyCode() {
        return foreignCurrencyCode;
    }

    /**
     * Sets the value of the foreignCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCurrencyCode(String value) {
        this.foreignCurrencyCode = value;
    }

    /**
     * Gets the value of the foreignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignAmount() {
        return foreignAmount;
    }

    /**
     * Sets the value of the foreignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignAmount(BigDecimal value) {
        this.foreignAmount = value;
    }

    /**
     * Gets the value of the foreignExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignExchangeRate() {
        return foreignExchangeRate;
    }

    /**
     * Sets the value of the foreignExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignExchangeRate(BigDecimal value) {
        this.foreignExchangeRate = value;
    }

}