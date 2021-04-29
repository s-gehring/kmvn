package gehring.simon.kvmn.model

import java.util.*
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 *
 * The `<dependency>` element contains information about a dependency
 * of the project.
 *
 * Java-Klasse für Dependency complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Dependency">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="classifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="systemPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="exclusions" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="exclusion" type="{http://maven.apache.org/POM/4.0.0}Exclusion" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependency", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Dependency(

  /**
   * The project group that produced the dependency, e.g.
  &lt;code&gt;org.apache.maven&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val groupId: String,
  /**
   * The unique id for an artifact produced by the project group, e.g.
  &lt;code&gt;maven-artifact&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String,
  /**
   * The version of the dependency, e.g. &lt;code&gt;3.2.1&lt;/code&gt;. In Maven 2, this can also be
  specified as a range of versions.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String,
  /**
   * The type of dependency. While it
  usually represents the extension on the filename of the dependency,
  that is not always the case. A type can be mapped to a different
  extension and a classifier.
  The type often corresponds to the packaging used, though this is also
  not always the case.
  Some examples are &lt;code&gt;jar&lt;/code&gt;, &lt;code&gt;war&lt;/code&gt;, &lt;code&gt;ejb-client&lt;/code&gt;
  and &lt;code&gt;test-jar&lt;/code&gt;: see &lt;a href=&quot;../maven-core/artifact-handlers.html&quot;&gt;default
  artifact handlers&lt;/a&gt; for a list.
  New types can be defined by plugins that set
  &lt;code&gt;extensions&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;, so this is not a complete list.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "jar")
  val type: String = "jar",
  /**
   * The classifier of the dependency. It is appended to
  the filename after the version. This allows:
  &lt;ul&gt;
  &lt;li&gt;referring to attached artifact, for example &lt;code&gt;sources&lt;/code&gt; and &lt;code&gt;javadoc&lt;/code&gt;:
  see &lt;a href=&quot;../maven-core/artifact-handlers.html&quot;&gt;default artifact handlers&lt;/a&gt; for a list,&lt;/li&gt;
  &lt;li&gt;distinguishing two artifacts
  that belong to the same POM but were built differently.
  For example, &lt;code&gt;jdk14&lt;/code&gt; and &lt;code&gt;jdk15&lt;/code&gt;.&lt;/li&gt;
  &lt;/ul&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val classifier: String,
  /**
   * The scope of the dependency - &lt;code&gt;compile&lt;/code&gt;, &lt;code&gt;runtime&lt;/code&gt;,
  &lt;code&gt;test&lt;/code&gt;, &lt;code&gt;system&lt;/code&gt;, and &lt;code&gt;provided&lt;/code&gt;. Used to
  calculate the various classpaths used for compilation, testing, and so on.
  It also assists in determining which artifacts to include in a distribution of
  this project. For more information, see
  &lt;a href=&quot;https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html&quot;&gt;the
  dependency mechanism&lt;/a&gt;. The default scope is &lt;code&gt;compile&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val scope: String,
  /**
   * FOR SYSTEM SCOPE ONLY. Note that use of this property is &lt;b&gt;discouraged&lt;/b&gt;
  and may be replaced in later versions. This specifies the path on the filesystem
  for this dependency.
  Requires an absolute path for the value, not relative.
  Use a property that gives the machine specific absolute path,
  e.g. &lt;code&gt;${java.home}&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val systemPath: String,
  /**
   * Lists a set of artifacts that should be excluded from this dependency&apos;s
  artifact list when it comes to calculating transitive dependencies.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val exclusions: Exclusions,
  /**
   * Indicates the dependency is optional for use of this library. While the
  version of the dependency will be taken into account for dependency calculation if the
  library is used elsewhere, it will not be passed on transitively. Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;. Default value is &lt;code&gt;false&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val optional: String) {


    /**
     *
     * Lists a set of artifacts that should be excluded from this dependency&apos;s
    artifact list when it comes to calculating transitive dependencies.
     *
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;element name="exclusion" type="{http://maven.apache.org/POM/4.0.0}Exclusion" maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = ["exclusion"])
    data class Exclusions(

      /**
       * Gets the value of the exclusion property.
       *
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the exclusion property.
       *
       * For example, to add a new item, do as follows:
       * <pre>
       * getExclusion().add(newItem);
       * </pre>
       *
       * Objects of the following type(s) are allowed in the list
       * [Exclusion]
       *
       */
      @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
      val exclusion: List<Exclusion> = Collections.emptyList())

}
