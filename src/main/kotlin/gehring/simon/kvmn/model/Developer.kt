package gehring.simon.kvmn.model

import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 * Information about one of the committers on this project.
 *
 * Java-Klasse für Developer complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Developer">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="organizationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="roles" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="properties" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Developer", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Developer(

  /**
   * The unique ID of the developer in the SCM.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val id: String,
  /**
   * The full name of the contributor.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The email address of the contributor.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val email: String,
  /**
   * The URL for the homepage of the contributor.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   * The organization to which the contributor belongs.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val organization: String,
  /**
   * The URL of the organization.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val organizationUrl: String,
  /**
   * The roles the contributor plays in the project. Each role is described by a
  &lt;code&gt;role&lt;/code&gt; element, the body of which is a role name. This can also be used to
  describe the contribution.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val roles: Roles,
  /**
   * The timezone the contributor is in. Typically, this is a number in the range
  &lt;a href=&quot;http://en.wikipedia.org/wiki/UTC%E2%88%9212:00&quot;&gt;-12&lt;/a&gt; to &lt;a href=&quot;http://en.wikipedia.org/wiki/UTC%2B14:00&quot;&gt;+14&lt;/a&gt;
  or a valid time zone id like &quot;America/Montreal&quot; (UTC-05:00) or &quot;Europe/Paris&quot; (UTC+01:00).
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val timezone: String,
  /**
   * Properties about the contributor, such as an instant messenger handle.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val properties: Properties) {


    /**
     *
     * Properties about the contributor, such as an instant messenger handle.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["any"])
    data class Properties(
      /**
       * Gets the value of the any property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the any property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getAny().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Element]
       *
       */
      @XmlAnyElement
      val any: List<Element> = Collections.emptyList())


    /**
     *
     * The roles the contributor plays in the project. Each role is described by a
    &lt;code&gt;role&lt;/code&gt; element, the body of which is a role name. This can also be used to
    describe the contribution.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["role"])
    data class Roles(

      /**
       * Gets the value of the role property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the role property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getRole().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [String]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val role: List<String> = Collections.emptyList()
    )


}