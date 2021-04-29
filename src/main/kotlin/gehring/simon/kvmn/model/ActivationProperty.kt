package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * This is the property specification used to activate a profile. If the value field
 * is empty, then the existence of the named property will activate the profile, otherwise it
 * does a case-sensitive match against the property value as well.
 *
 * Java-Klasse für ActivationProperty complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ActivationProperty">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationProperty", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class ActivationProperty(

  /**
   * The name of the property to be used to activate a profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The value of the property required to activate a profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val value: String)
