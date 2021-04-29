package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Describes the licenses for this project. This is used to generate the license
 * page of the project's web site, as well as being taken into consideration in other reporting
 * and validation. The licenses listed for the project are that of the project itself, and not
 * of dependencies.
 *
 * Java-Klasse für License complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="License">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class License(

  /**
   * The full legal name of the license.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The official url for the license text.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   *  The primary method by which this project may be distributed.
  &lt;dl&gt;
  &lt;dt&gt;repo&lt;/dt&gt;
  &lt;dd&gt;may be downloaded from the Maven repository&lt;/dd&gt;
  &lt;dt&gt;manual&lt;/dt&gt;
  &lt;dd&gt;user must manually download and install the dependency.&lt;/dd&gt;
  &lt;/dl&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val distribution: String,
  /**
   * Addendum information pertaining to this license.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val comments: String)