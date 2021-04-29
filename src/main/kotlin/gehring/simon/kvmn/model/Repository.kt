package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * A repository contains the information needed for establishing connections with
 * remote repository.
 *
 * Java-Klasse für Repository complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Repository">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="releases" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/>
 * &lt;element name="snapshots" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/>
 * &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repository", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Repository(

  /**
   * How to handle downloading of releases from this repository.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val releases: RepositoryPolicy,
  /**
   * How to handle downloading of snapshots from this repository.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val snapshots: RepositoryPolicy,
  /**
   * A unique identifier for a repository. This is used to match the repository
  to configuration in the &lt;code&gt;settings.xml&lt;/code&gt; file, for example. Furthermore, the identifier is
  used during POM inheritance and profile injection to detect repositories that should be merged.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val id: String,
  /**
   * Human readable name of the repository.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val name: String,
  /**
   * The url of the repository, in the form &lt;code&gt;protocol://hostname/path&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val url: String,
  /**
   * The type of layout this repository uses for locating and storing artifacts -
  can be &lt;code&gt;legacy&lt;/code&gt; or &lt;code&gt;default&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
  val layout: String)
