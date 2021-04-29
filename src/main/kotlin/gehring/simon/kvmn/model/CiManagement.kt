package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 *
 * The `<CiManagement>` element contains informations required to the
 * continuous integration system of the project.
 *
 * Java-Klasse für CiManagement complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CiManagement">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="notifiers" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="notifier" type="{http://maven.apache.org/POM/4.0.0}Notifier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CiManagement", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class CiManagement(

  /**
   * The name of the continuous integration system, e.g. &lt;code&gt;continuum&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val system: String,
  /**
   * URL for the continuous integration system used by the project if it has a web
  interface.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   * Configures one method for notifying users/developers when a build breaks.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val notifiers: Notifiers) {


    /**
     *
     * Configures one method for notifying users/developers when a build breaks.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="notifier" type="{http://maven.apache.org/POM/4.0.0}Notifier" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["notifier"])
    data class Notifiers(

      /**
       * Gets the value of the notifier property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the notifier property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getNotifier().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Notifier]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val notifier: List<Notifier> = Collections.emptyList())

}
