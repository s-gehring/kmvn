package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Describes where an artifact has moved to. If any of the values are omitted, it is
 * assumed to be the same as it was before.
 *
 * Java-Klasse für Relocation complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Relocation">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relocation", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Relocation(

  /**
   * The group ID the artifact has moved to.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val groupId: String,
  /**
   * The new artifact ID of the artifact.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String,
  /**
   * The new version of the artifact.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String,
  /**
   * An additional message to show the user about the move, such as the reason.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val message: String)
