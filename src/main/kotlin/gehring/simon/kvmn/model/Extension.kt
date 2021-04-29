package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Describes a build extension to utilise.
 *
 * Java-Klasse für Extension complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Extension">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Extension(

  /**
   * The group ID of the extension&apos;s artifact.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val groupId: String,
  /**
   * The artifact ID of the extension.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String,
  /**
   * The version of the extension.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String)
