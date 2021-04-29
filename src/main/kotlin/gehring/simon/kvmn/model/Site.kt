package gehring.simon.kvmn.model

import javax.xml.bind.annotation.*


/**
 * Contains the information needed for deploying websites.
 *
 * Java-Klasse für Site complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Site">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;attribute name="child.site.url.inherit.append.path" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Site", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Site(

  /**
   * A unique identifier for a deployment location. This is used to match the
  site to configuration in the &lt;code&gt;settings.xml&lt;/code&gt; file, for example.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val id: String,
  /**
   * Human readable name of the deployment location.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The url of the location where website is deployed, in the form &lt;code&gt;protocol://hostname/path&lt;/code&gt;.
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: parent value [+ path adjustment] + (artifactId or project.directory property), or just parent value if
  site&apos;s &lt;code&gt;child.site.url.inherit.append.path=&quot;false&quot;&lt;/code&gt;
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   * When childs inherit from distribution management site url, append path or not? Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Default value is&lt;/b&gt;: &lt;code&gt;true&lt;/code&gt;
  &lt;br&gt;&lt;b&gt;Since&lt;/b&gt;: Maven 3.6.1
   */
  @XmlAttribute(name = "child.site.url.inherit.append.path")
  val childSiteUrlInheritAppendPath: String)