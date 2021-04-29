package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Information about the issue tracking (or bug tracking) system used to manage this
 * project.
 *
 * Java-Klasse für IssueManagement complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="IssueManagement">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueManagement", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class IssueManagement(

  /**
   * The name of the issue management system, e.g. Bugzilla
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val system: String,
  /**
   * URL for the issue management system used by the project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String)