package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Section for management of default dependency information for use in a group of
 * POMs.
 *
 * Java-Klasse für DependencyManagement complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DependencyManagement">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="dependencies" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DependencyManagement", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class DependencyManagement(

  /**
   *  This element describes all of the dependencies associated with a
  project.
  These dependencies are used to construct a classpath for your
  project during the build process. They are automatically downloaded from the
  repositories defined in this project.
  See &lt;a href=&quot;https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html&quot;&gt;the
  dependency mechanism&lt;/a&gt; for more information.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val dependencies: Dependencies) {


    /**
     *
     *This element describes all of the dependencies associated with a
    project.
    These dependencies are used to construct a classpath for your
    project during the build process. They are automatically downloaded from the
    repositories defined in this project.
    See &lt;a href=&quot;https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html&quot;&gt;the
    dependency mechanism&lt;/a&gt; for more information.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["dependency"])
    data class Dependencies(

      /**
       * Gets the value of the dependency property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the dependency property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getDependency().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Dependency]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val dependency: List<Dependency> = Collections.emptyList())


}
