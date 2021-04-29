package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Specifies the organization that produces this project.
 *
 * Java-Klasse für Organization complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Organization">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Organization(

  /**
   * The full name of the organization.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The URL to the organization&apos;s home page.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String)
