package gehring.simon.kvmn.model

import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 *
 * The `<plugin>` element contains informations required for a report plugin.
 *
 * Java-Klasse für ReportPlugin complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReportPlugin">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="reportSets" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="reportSet" type="{http://maven.apache.org/POM/4.0.0}ReportSet" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReportPlugin", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class ReportPlugin(

  /**
   * The group ID of the reporting plugin in the repository.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "org.apache.maven.plugins")
  val groupId: String,
  /**
   * The artifact ID of the reporting plugin in the repository.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String,
  /**
   * The version of the reporting plugin to be used.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String,
  /**
   *  Multiple specifications of a set of reports, each having (possibly) different
  configuration. This is the reporting parallel to an &lt;code&gt;execution&lt;/code&gt; in the build.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reportSets: ReportSets,
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
     * &lt;element name="reportSet" type="{http://maven.apache.org/POM/4.0.0}ReportSet" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["reportSet"])
    data class ReportSets(

      /**
       * Gets the value of the reportSet property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the reportSet property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getReportSet().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [ReportSet]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val reportSet: List<ReportSet> = Collections.emptyList())

}
