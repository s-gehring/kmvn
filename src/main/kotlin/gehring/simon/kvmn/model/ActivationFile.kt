package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * This is the file specification used to activate the profile. The `missing` value
 * is the location of a file that needs to exist, and if it doesn't, the profile will be
 * activated. On the other hand, `exists` will test for the existence of the file and if it is
 * there, the profile will be activated.<br></br>
 * Variable interpolation for these file specifications is limited to `${basedir}`,
 * System properties and request properties.
 *
 * Java-Klasse für ActivationFile complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ActivationFile">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="missing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="exists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationFile", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class ActivationFile(

  /**
   * The name of the file that must be missing to activate the
  profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val missing: String,
  /**
   * The name of the file that must exist to activate the profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val exists: String)
