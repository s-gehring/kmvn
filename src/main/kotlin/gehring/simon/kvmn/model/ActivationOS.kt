package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * This is an activator which will detect an operating system's attributes in order
 * to activate its profile.
 *
 * Java-Klasse für ActivationOS complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ActivationOS">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="arch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationOS", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class ActivationOS(

  /**
   * The name of the operating system to be used to activate the profile. This must be an exact match
  of the &lt;code&gt;${os.name}&lt;/code&gt; Java property, such as &lt;code&gt;Windows XP&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The general family of the OS to be used to activate the profile, such as
  &lt;code&gt;windows&lt;/code&gt; or &lt;code&gt;unix&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val family: String,
  /**
   * The architecture of the operating system to be used to activate the
  profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val arch: String,
  /**
   * The version of the operating system to be used to activate the
  profile
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String)
