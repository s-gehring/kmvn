package gehring.simon.kvmn.model

import javax.xml.bind.annotation.*


/**
 *
 * The `<scm>` element contains informations required to the SCM
 * (Source Control Management) of the project.
 *
 * Java-Klasse für Scm complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Scm">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="developerConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;attribute name="child.scm.connection.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="child.scm.developerConnection.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="child.scm.url.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scm", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Scm(

  /**
   * The source control management system URL
  that describes the repository and how to connect to the
  repository. For more information, see the
  &lt;a href=&quot;https://maven.apache.org/scm/scm-url-format.html&quot;&gt;URL format&lt;/a&gt;
  and &lt;a href=&quot;https://maven.apache.org/scm/scms-overview.html&quot;&gt;list of supported SCMs&lt;/a&gt;.
  This connection is read-only.
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
  scm&apos;s &lt;code&gt;child.scm.connection.inherit.append.path=&quot;false&quot;&lt;/code&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val connection: String,
  /**
   * Just like &lt;code&gt;connection&lt;/code&gt;, but for developers, i.e. this scm connection
  will not be read only.
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
  scm&apos;s &lt;code&gt;child.scm.developerConnection.inherit.append.path=&quot;false&quot;&lt;/code&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val developerConnection: String,
  /**
   * The tag of current code. By default, it&apos;s set to HEAD during development.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "HEAD")
  val tag: String,
  /**
   * The URL to the project&apos;s browsable SCM repository, such as ViewVC or Fisheye.
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
  scm&apos;s &lt;code&gt;child.scm.url.inherit.append.path=&quot;false&quot;&lt;/code&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   * When childs inherit from scm connection, append path or not? Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: &lt;code&gt;true&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Since&lt;/b&gt;: Maven 3.6.1
   */
  @XmlAttribute(name = "child.scm.connection.inherit.append.path")
  val childScmConnectionInheritAppendPath: String,
  /**
   * When childs inherit from scm developer connection, append path or not? Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: &lt;code&gt;true&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Since&lt;/b&gt;: Maven 3.6.1
   */
  @XmlAttribute(name = "child.scm.developerConnection.inherit.append.path")
  val childScmDeveloperConnectionInheritAppendPath: String,
  /**
   * When childs inherit from scm url, append path or not? Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: &lt;code&gt;true&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Since&lt;/b&gt;: Maven 3.6.1
   */
  @XmlAttribute(name = "child.scm.url.inherit.append.path")
  val childScmUrlInheritAppendPath: String)
