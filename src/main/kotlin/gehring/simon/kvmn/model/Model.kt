package gehring.simon.kvmn.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import org.w3c.dom.Element
import java.util.*
import javax.xml.bind.annotation.*


/**
 *
 * The `<project>` element is the root of the descriptor.
 * The following table lists all of the possible child elements.
 *
 * Java-Klasse für Model complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Model">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="parent" type="{http://maven.apache.org/POM/4.0.0}Parent" minOccurs="0"/>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="inceptionYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="organization" type="{http://maven.apache.org/POM/4.0.0}Organization" minOccurs="0"/>
 * &lt;element name="licenses" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="developers" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="contributors" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="mailingLists" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="prerequisites" type="{http://maven.apache.org/POM/4.0.0}Prerequisites" minOccurs="0"/>
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
 * &lt;element name="scm" type="{http://maven.apache.org/POM/4.0.0}Scm" minOccurs="0"/>
 * &lt;element name="issueManagement" type="{http://maven.apache.org/POM/4.0.0}IssueManagement" minOccurs="0"/>
 * &lt;element name="ciManagement" type="{http://maven.apache.org/POM/4.0.0}CiManagement" minOccurs="0"/>
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
 * &lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}Build" minOccurs="0"/>
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
 * &lt;element name="profiles" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/all>
 * &lt;attribute name="child.project.url.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
@JacksonXmlRootElement(localName = "project")
data class Model(

  /**
   * Declares to which version of project descriptor this POM conforms.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val modelVersion: String? = null,
  /**
   * The location of the parent project, if one exists. Values from the parent
  project will be the default for this project if they are left unspecified. The location
  is given as a group ID, artifact ID and version.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val parent: Parent? = null,
  /**
   * A universally unique identifier for a project. It is normal to
  use a fully-qualified package name to distinguish it from other
  projects with a similar name (eg. &lt;code&gt;org.apache.maven&lt;/code&gt;).
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val groupId: String? = null,
  /**
   * The identifier for this artifact that is unique within the group given by the
  group ID. An artifact is something that is either produced or used by a project.
  Examples of artifacts produced by Maven for a project include: JARs, source and binary
  distributions, and WARs.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String? = null,
  /**
   * The current version of the artifact produced by this project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String? = null,
  /**
   * The type of artifact this project produces, for example &lt;code&gt;jar&lt;/code&gt;
  &lt;code&gt;war&lt;/code&gt;
  &lt;code&gt;ear&lt;/code&gt;
  &lt;code&gt;pom&lt;/code&gt;.
  Plugins can create their own packaging, and
  therefore their own packaging types,
  so this list does not contain all possible types.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "jar")
  val packaging: String? = null,
  /**
   * The full name of the project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String? = null,
  /**
   * A detailed description of the project, used by Maven whenever it needs to
  describe the project, such as on the web site. While this element can be specified as
  CDATA to enable the use of HTML tags within the description, it is discouraged to allow
  plain text representation. If you need to modify the index page of the generated web
  site, you are able to specify your own instead of adjusting this text.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val description: String? = null,
  /**
   * The URL to the project&apos;s homepage.
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
  project&apos;s &lt;code&gt;child.project.url.inherit.append.path=&quot;false&quot;&lt;/code&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String? = null,
  /**
   * The year of the project&apos;s inception, specified with 4 digits. This value is
  used when generating copyright notices as well as being informational.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val inceptionYear: String? = null,
  /**
   * This element describes various attributes of the organization to which the
  project belongs. These attributes are utilized when documentation is created (for
  copyright notices and links).
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val organization: Organization? = null,
  /**
   * This element describes all of the licenses for this project.
  Each license is described by a &lt;code&gt;license&lt;/code&gt; element, which
  is then described by additional elements.
  Projects should only list the license(s) that applies to the project
  and not the licenses that apply to dependencies.
  If multiple licenses are listed, it is assumed that the user can select
  any of them, not that they must accept all.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val licenses: Licenses? = null,
  /**
   * Describes the committers of a project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val developers: Developers? = null,
  /**
   * Describes the contributors to a project that are not yet committers.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val contributors: Contributors? = null,
  /**
   * Contains information about a project&apos;s mailing lists.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val mailingLists: MailingLists? = null,
  /**
   * Describes the prerequisites in the build environment for this project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val prerequisites: Prerequisites? = null,
  /**
   * The modules (sometimes called subprojects) to build as a part of this
  project. Each module listed is a relative path to the directory containing the module.
  To be consistent with the way default urls are calculated from parent, it is recommended
  to have module names match artifact ids.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val modules: Modules? = null,
  /**
   * Specification for the SCM used by the project, such as CVS, Subversion, etc.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val scm: Scm? = null,
  /**
   * The project&apos;s issue management system information.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val issueManagement: IssueManagement? = null,
  /**
   * The project&apos;s continuous integration information.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val ciManagement: CiManagement? = null,
  /**
   * Distribution information for a project that enables deployment of the site
  and artifacts to remote web servers and repositories respectively.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val distributionManagement: DistributionManagement? = null,
  /**
   * Properties that can be used throughout the POM as a substitution, and
  are used as filters in resources if enabled.
  The format is &lt;code&gt;&amp;lt;name&amp;gt;value&amp;lt;/name&amp;gt;&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val properties: Properties? = null,
  /**
   * Default dependency information for projects that inherit from this one. The
  dependencies in this section are not immediately resolved. Instead, when a POM derived
  from this one declares a dependency described by a matching groupId and artifactId, the
  version and other values from this section are used for that dependency if they were not
  already specified.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val dependencyManagement: DependencyManagement? = null,
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
  val dependencies: Dependencies? = null,
  /**
   * The lists of the remote repositories for discovering dependencies and
  extensions.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val repositories: Repositories? = null,
  /**
   * The lists of the remote repositories for discovering plugins for builds and
  reports.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val pluginRepositories: PluginRepositories? = null,
  /**
   * Information required to build the project.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val build: Build? = null,
  /**
   * &lt;b&gt;Deprecated&lt;/b&gt;. Now ignored by Maven.
   */
  @Deprecated("Now ignored by Maven.")
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reports: Reports? = null,
  /**
   * This element includes the specification of report plugins to use
  to generate the reports on the Maven-generated site.
  These reports will be run when a user executes &lt;code&gt;mvn site&lt;/code&gt;.
  All of the reports will be included in the navigation bar for browsing.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val reporting: Reporting? = null,
  /**
   * A listing of project-local build profiles which will modify the build process
  when activated.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val profiles: Profiles? = null,
  /**
   * When childs inherit from project&apos;s url, append path or not? Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: &lt;code&gt;true&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Since&lt;/b&gt;: Maven 3.6.1
   */
  @XmlAttribute(name = "child.project.url.inherit.append.path")
  val childProjectUrlInheritAppendPath: String? = null) {


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
     * &lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["contributor"])
    data class Contributors(

      /**
       * Gets the value of the contributor property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the contributor property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getContributor().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Contributor]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val contributor: List<Contributor> = Collections.emptyList())


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
     * &lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["developer"])
    data class Developers(

      /**
       * Gets the value of the developer property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the developer property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getDeveloper().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Developer]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val developer: List<Developer> = Collections.emptyList())


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
     * &lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["license"])
    data class Licenses(

      /**
       * Gets the value of the license property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the license property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getLicense().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [License]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val license: List<License> = Collections.emptyList())

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
     * &lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["mailingList"])
    data class MailingLists(

      /**
       * Gets the value of the mailingList property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the mailingList property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getMailingList().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [MailingList]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val mailingList: List<MailingList> = Collections.emptyList())


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
     * &lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["profile"])
    data class Profiles(

      /**
       * Gets the value of the profile property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the profile property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getProfile().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Profile]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val profile: List<Profile> = Collections.emptyList())


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
