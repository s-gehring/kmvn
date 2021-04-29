package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Section for management of reports and their configuration.
 *
 * Java-Klasse für Reporting complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Reporting">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="excludeDefaults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="plugins" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Reporting", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Reporting(

  /**
   * If true, then the default reports are not included in the site generation.
  This includes the reports in the &quot;Project Info&quot; menu. Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;. Default value is &lt;code&gt;false&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val excludeDefaults: String,
  /**
   * Where to store all of the generated reports. The default is
  &lt;code&gt;${project.build.directory}/site&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val outputDirectory: String,
  /**
   * The reporting plugins to use and their configuration.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val plugins: Plugins) {


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
     * &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["plugin"])
    data class Plugins(

      /**
       * Gets the value of the plugin property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the plugin property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getPlugin().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [ReportPlugin]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val plugin: List<ReportPlugin> = Collections.emptyList())

}
