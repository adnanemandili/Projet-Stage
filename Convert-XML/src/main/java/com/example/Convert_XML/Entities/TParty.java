//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.04 at 10:06:44 PM WEST 
//


package com.example.Convert_XML.Entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t_party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_party">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{}party_role_type"/>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element name="person" type="{}t_person"/>
 *             &lt;element name="person_my_client" type="{}t_person_my_client"/>
 *             &lt;element name="account" type="{}t_account"/>
 *             &lt;element name="account_my_client" type="{}t_account_my_client"/>
 *             &lt;element name="entity" type="{}t_entity"/>
 *             &lt;element name="entity_my_client" type="{}t_entity_my_client"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="funds_code" type="{}funds_type"/>
 *         &lt;element name="funds_comment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foreign_currency" type="{}t_foreign_currency" minOccurs="0"/>
 *         &lt;element name="country" type="{}country_type"/>
 *         &lt;element name="significance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="comments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="4000"/>
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
@XmlType(name = "t_party", propOrder = {
    "role",
    "person",
    "personMyClient",
    "account",
    "accountMyClient",
    "entity",
    "entityMyClient",
    "fundsCode",
    "fundsComment",
    "foreignCurrency",
    "country",
    "significance",
    "comments"
})
public class TParty {

    @XmlElement(required = true)
    protected String role;
    protected TPerson person;
    @XmlElement(name = "person_my_client")
    protected TPersonMyClient personMyClient;
    protected TAccount account;
    @XmlElement(name = "account_my_client")
    protected TAccountMyClient accountMyClient;
    protected TEntity entity;
    @XmlElement(name = "entity_my_client")
    protected TEntityMyClient entityMyClient;
    @XmlElement(name = "funds_code", required = true)
    protected String fundsCode;
    @XmlElement(name = "funds_comment")
    protected String fundsComment;
    @XmlElement(name = "foreign_currency")
    protected TForeignCurrency foreignCurrency;
    @XmlElement(required = true)
    protected String country;
    protected Integer significance;
    protected String comments;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link TPerson }
     *     
     */
    public TPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPerson }
     *     
     */
    public void setPerson(TPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the personMyClient property.
     * 
     * @return
     *     possible object is
     *     {@link TPersonMyClient }
     *     
     */
    public TPersonMyClient getPersonMyClient() {
        return personMyClient;
    }

    /**
     * Sets the value of the personMyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPersonMyClient }
     *     
     */
    public void setPersonMyClient(TPersonMyClient value) {
        this.personMyClient = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link TAccount }
     *     
     */
    public TAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccount }
     *     
     */
    public void setAccount(TAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountMyClient property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountMyClient }
     *     
     */
    public TAccountMyClient getAccountMyClient() {
        return accountMyClient;
    }

    /**
     * Sets the value of the accountMyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountMyClient }
     *     
     */
    public void setAccountMyClient(TAccountMyClient value) {
        this.accountMyClient = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link TEntity }
     *     
     */
    public TEntity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEntity }
     *     
     */
    public void setEntity(TEntity value) {
        this.entity = value;
    }

    /**
     * Gets the value of the entityMyClient property.
     * 
     * @return
     *     possible object is
     *     {@link TEntityMyClient }
     *     
     */
    public TEntityMyClient getEntityMyClient() {
        return entityMyClient;
    }

    /**
     * Sets the value of the entityMyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEntityMyClient }
     *     
     */
    public void setEntityMyClient(TEntityMyClient value) {
        this.entityMyClient = value;
    }

    /**
     * Gets the value of the fundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsCode() {
        return fundsCode;
    }

    /**
     * Sets the value of the fundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsCode(String value) {
        this.fundsCode = value;
    }

    /**
     * Gets the value of the fundsComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsComment() {
        return fundsComment;
    }

    /**
     * Sets the value of the fundsComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsComment(String value) {
        this.fundsComment = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TForeignCurrency }
     *     
     */
    public TForeignCurrency getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TForeignCurrency }
     *     
     */
    public void setForeignCurrency(TForeignCurrency value) {
        this.foreignCurrency = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the significance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignificance() {
        return significance;
    }

    /**
     * Sets the value of the significance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignificance(Integer value) {
        this.significance = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
