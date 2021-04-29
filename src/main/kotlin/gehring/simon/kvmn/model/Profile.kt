package gehring.simon.kvmn.model

import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 * Modifications to the build process which is activated based on environmental
 * parameters or command line arguments.
 *
 * Java-Klasse für Profile complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Profile">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="activation" type="{http://maven.apache.org/POM/4.0.0}Activation" minOccurs="0"/>
 * &lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}BuildBase" minOccurs="0"/>
 * &lt;element name="modules" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="distributionManagement" type="{http://maven.apache.org/POM/4.0.0}DistributionManagement" minOccurs="0"/>
 * &lt;element name="properties" minOccurs="0">
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
 * &lt;element name="dependencyManagement" type="{http://maven.apache.org/POM/4.0.0}DependencyManagement" minOccurs="0"/>
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
 * &lt;element name="repositories" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="pluginRepositories" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="reports" minOccurs="0">
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
 * &lt;element name="reporting" type="{http://maven.apache.org/POM/4.0.0}Reporting" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Profile(

  /**
   * The identifier of this build profile. This is used for command line
  activation, and identifies profiles to be merged.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
  val id: String,
  /**
   * The conditional logic which will automatically trigger the inclusion of this
  profile.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val activation: Activation,
  /**
   * Information required to build the project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val build: BuildBase,
  /**
   * The modules (sometimes called subprojects) to build as a part of this
  project. Each module listed is a relative path to the directory containing the module.
  To be consistent with the way default urls are calculated from parent, it is recommended
  to have module names match artifact ids.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val modules: Modules,
  /**
   * Distribution information for a project that enables deployment of the site
  and artifacts to remote web servers and repositories respectively.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val distributionManagement: DistributionManagement,
  /**
   * Properties that can be used throughout the POM as a substitution, and
  are used as filters in resources if enabled.
  The format is &lt;code&gt;&amp;lt;name&amp;gt;value&amp;lt;/name&amp;gt;&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val properties: Properties,
  /**
   * Default dependency information for projects that inherit from this one. The
  dependencies in this section are not immediately resolved. Instead, when a POM derived
  from this one declares a dependency described by a matching groupId and artifactId, the
  version and other values from this section are used for that dependency if they were not
  already specified.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val dependencyManagement: DependencyManagement,
  /**
   * This element describes all of the dependencies associated with a
  project.
  These dependencies are used to construct a classpath for your
  project during the build process. They are automatically downloaded from the
  repositories defined in this project.
  See &lt;a href=&quot;https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html&quot;&gt;the
  dependency mechanism&lt;/a&gt; for more information.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val dependencies: Dependencies,
  /**
   * The lists of the remote repositories for discovering dependencies and
  extensions.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val repositories: Repositories,
  /**
   * The lists of the remote repositories for discovering plugins for builds and
  reports.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val pluginRepositories: PluginRepositories,
  /**
   * &lt;b&gt;Deprecated&lt;/b&gt;. Now ignored by Maven.
   */
  @Deprecated("Now ignored by Maven.")
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reports: Reports,
  /**
   * This element includes the specification of report plugins to use
  to generate the reports on the Maven-generated site.
  These reports will be run when a user executes &lt;code&gt;mvn site&lt;/code&gt;.
  All of the reports will be included in the navigation bar for browsing.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reporting: Reporting) {


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
     * &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["module"])
    data class Modules(

      /**
       * Gets the value of the module property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the module property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getModule().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [String]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val module: List<String> = Collections.emptyList())

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
     * &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["pluginRepository"])
    data class PluginRepositories(

      /**
       * Gets the value of the pluginRepository property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getPluginRepository().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Repository]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val pluginRepository: List<Repository> = Collections.emptyList())

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
    data class Properties(

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
    data class Reports(
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
     * &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["repository"])
    data class Repositories(

      /**
       * Gets the value of the repository property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the repository property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getRepository().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Repository]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val repository: List<Repository> = Collections.emptyList())
}
