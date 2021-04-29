package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * This element describes all of the mailing lists associated with a project. The
 * auto-generated site references this information.
 *
 * Java-Klasse für MailingList complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MailingList">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="unsubscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="otherArchives" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MailingList", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class MailingList(

  /**
   * The name of the mailing list.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The email address or link that can be used to subscribe to
  the mailing list.  If this is an email address, a
  &lt;code&gt;mailto:&lt;/code&gt; link will automatically be created
  when the documentation is created.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val subscribe: String,
  /**
   * The email address or link that can be used to unsubscribe to
  the mailing list.  If this is an email address, a
  &lt;code&gt;mailto:&lt;/code&gt; link will automatically be created
  when the documentation is created.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val unsubscribe: String,
  /**
   * The email address or link that can be used to post to
  the mailing list.  If this is an email address, a
  &lt;code&gt;mailto:&lt;/code&gt; link will automatically be created
  when the documentation is created.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val post: String,
  /**
   * The link to a URL where you can browse the mailing list archive.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val archive: String,
  /**
   * The link to alternate URLs where you can browse the list archive.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val otherArchives: OtherArchives) {


    /**
     *
     * The link to alternate URLs where you can browse the list archive.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["otherArchive"])
    data class OtherArchives(

      /**
       * Gets the value of the otherArchive property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the otherArchive property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getOtherArchive().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [String]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val otherArchive: List<String> = Collections.emptyList())

}
