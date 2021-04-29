package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 *
 * The `<build>` element contains informations required to build the project.
 * Default values are defined in Super POM.
 *
 * Java-Klasse für Build complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Build">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="sourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="scriptSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="testSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="testOutputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="extensions" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="extension" type="{http://maven.apache.org/POM/4.0.0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="defaultGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="resources" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="resource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="testResources" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="testResource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="finalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="filters" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="pluginManagement" type="{http://maven.apache.org/POM/4.0.0}PluginManagement" minOccurs="0"/>
 * &lt;element name="plugins" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Build", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Build(

  /**
   * This element specifies a directory containing the source of the project. The
  generated build system will compile the sources from this directory when the project is
  built. The path given is relative to the project descriptor.
  The default value is &lt;code&gt;src/main/java&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val sourceDirectory: String,
  /**
   * This element specifies a directory containing the script sources of the
  project. This directory is meant to be different from the sourceDirectory, in that its
  contents will be copied to the output directory in most cases (since scripts are
  interpreted rather than compiled).
  The default value is &lt;code&gt;src/main/scripts&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val scriptSourceDirectory: String,
  /**
   * This element specifies a directory containing the unit test source of the
  project. The generated build system will compile these directories when the project is
  being tested. The path given is relative to the project descriptor.
  The default value is &lt;code&gt;src/test/java&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val testSourceDirectory: String,
  /**
   * The directory where compiled application classes are placed.
  The default value is &lt;code&gt;target/classes&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val outputDirectory: String,
  /**
   * The directory where compiled test classes are placed.
  The default value is &lt;code&gt;target/test-classes&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val testOutputDirectory: String,
  /**
   * A set of build extensions to use from this project
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val extensions: Extensions,
  /**
   * The default goal (or phase in Maven 2) to execute when none is specified for
  the project. Note that in case of a multi-module build, only the default goal of the top-level
  project is relevant, i.e. the default goals of child modules are ignored. Since Maven 3,
  multiple goals/phases can be separated by whitespace.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val defaultGoal: String,
  /**
   *  This element describes all of the classpath resources such as properties
  files associated with a project. These resources are often included in the final
  package.
  The default value is &lt;code&gt;src/main/resources&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val resources: Resources,
  /**
   *  This element describes all of the classpath resources such as properties
  files associated with a project&apos;s unit tests.
  The default value is &lt;code&gt;src/test/resources&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val testResources: TestResources,
  /**
   * The directory where all files generated by the build are placed.
  The default value is &lt;code&gt;target&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val directory: String,
  /**
   *The filename (excluding the extension, and with no path information) that
  the produced artifact will be called.
  The default value is &lt;code&gt;${artifactId}-${version}&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val finalName: String,
  /**
   * The list of filter properties files that are used when filtering is enabled.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val filters: Filters,
  /**
   * Default plugin information to be made available for reference by projects
  derived from this one. This plugin configuration will not be resolved or bound to the
  lifecycle unless referenced. Any local configuration for a given plugin will override
  the plugin&apos;s entire definition here.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val pluginManagement: PluginManagement,
  /**
   * The list of plugins to use.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val plugins: Plugins) {


    /**
     *
     * Describes a build extension to utilise.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="extension" type="{http://maven.apache.org/POM/4.0.0}Extension" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["extension"])
    data class Extensions(
      /**
       * Gets the value of the extension property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the extension property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getExtension().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Extension]
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val extension: List<Extension> = Collections.emptyList())


    /**
     *
     * The list of filter properties files that are used when filtering is enabled.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["filter"])
    data class Filters(
      /**
       * Gets the value of the filter property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the filter property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getFilter().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [String]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val filter: List<String> = Collections.emptyList())

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
     * &lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/>
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
       * [Plugin]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val plugin: List<Plugin> = Collections.emptyList())


    /**
     *
     * This element describes all of the classpath resources such as properties
    files associated with a project. These resources are often included in the final
    package.
    The default value is &lt;code&gt;src/main/resources&lt;/code&gt;.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="resource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["resource"])
    data class Resources(

      /**
       * Gets the value of the resource property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the resource property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getResource().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Resource]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val resource: List<Resource> = Collections.emptyList()
    )


    /**
     *
     * This element describes all of the classpath resources such as properties
    files associated with a project&apos;s unit tests.
    The default value is &lt;code&gt;src/test/resources&lt;/code&gt;.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="testResource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["testResource"])
    data class TestResources(

      /**
       * Gets the value of the testResource property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the testResource property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getTestResource().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Resource]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val testResource: List<Resource> = Collections.emptyList())

}
