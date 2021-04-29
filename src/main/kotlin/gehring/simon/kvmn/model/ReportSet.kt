package gehring.simon.kvmn.model

import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 * Represents a set of reports and configuration to be used to generate them.
 *
 * Java-Klasse für ReportSet complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReportSet">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="reports" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ReportSet", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class ReportSet(

  /**
   * The unique id for this report set, to be used during POM inheritance and profile injection
  for merging of report sets.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
  val id: String,
  /**
   * The list of reports from this plugin which should be generated from this set.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reports: Reports,
  /**
   * Whether any configuration should be propagated to child POMs. Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;. Default value is &lt;code&gt;true&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val inherited: String,
  /**
   * &lt;p&gt;The configuration as DOM object.&lt;/p&gt;
  &lt;p&gt;By default, every element content is trimmed, but starting with Maven 3.1.0, you can add
  &lt;code&gt;xml:space=&quot;preserve&quot;&lt;/code&gt; to elements you want to preserve whitespace.&lt;/p&gt;
  &lt;p&gt;You can control how child POMs inherit configuration from parent POMs by adding &lt;code&gt;combine.children&lt;/code&gt;
  or &lt;code&gt;combine.self&lt;/code&gt; attributes to the children of the configuration element:&lt;/p&gt;
  &lt;ul&gt;
  &lt;li&gt;&lt;code&gt;combine.children&lt;/code&gt;: available values are &lt;code&gt;merge&lt;/code&gt; (default) and &lt;code&gt;append&lt;/code&gt;,&lt;/li&gt;
  &lt;li&gt;&lt;code&gt;combine.self&lt;/code&gt;: available values are &lt;code&gt;merge&lt;/code&gt; (default) and &lt;code&gt;override&lt;/code&gt;.&lt;/li&gt;
  &lt;/ul&gt;
  &lt;p&gt;See &lt;a href=&quot;https://maven.apache.org/pom.html#Plugins&quot;&gt;POM Reference documentation&lt;/a&gt; and
  &lt;a href=&quot;https://codehaus-plexus.github.io/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html&quot;&gt;Xpp3DomUtils&lt;/a&gt;
  for more information.&lt;/p&gt;
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
     * &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["report"])
    data class Reports(

      /**
       * Gets the value of the report property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the report property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getReport().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [String]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val report: List<String> = Collections.emptyList())

}
