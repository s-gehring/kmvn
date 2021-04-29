package gehring.simon.kvmn.model

import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 * Configures one method for notifying users/developers when a build breaks.
 *
 * Java-Klasse für Notifier complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Notifier">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="sendOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="sendOnFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="sendOnSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="sendOnWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="configuration" minOccurs="0">
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
@XmlType(name = "Notifier", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Notifier(

  /**
   * The mechanism used to deliver notifications.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "mail")
  val type: String,
  /**
   * Whether to send notifications on error.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
  val isSendOnError: Boolean = true,
  /**
   * Whether to send notifications on failure.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
  val isSendOnFailure: Boolean = true,
  /**
   * Whether to send notifications on success.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
  val isSendOnSuccess: Boolean = true,
  /**
   * Whether to send notifications on warning.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
  val isSendOnWarning: Boolean = true,
  /**
   * &lt;b&gt;Deprecated&lt;/b&gt;. Where to send the notification to - eg email address.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val address: String,
  /**
   * Extended configuration specific to this notifier goes here.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val configuration: Configuration) {


    /**
     *
     * Java-Klasse für anonymous complex type.
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
    data class Configuration(

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

}
