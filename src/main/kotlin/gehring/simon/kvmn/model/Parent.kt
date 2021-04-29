package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 *
 * The `<parent>` element contains information required to locate the parent project from which
 * this project will inherit from.
 * **Note:** The children of this element are not interpolated and must be given as literal values.
 *
 * Java-Klasse für Parent complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Parent">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="relativePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parent", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Parent(

  /**
   * The group id of the parent project to inherit from.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val groupId: String,
  /**
   * The artifact id of the parent project to inherit from.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val artifactId: String,
  /**
   * The version of the parent project to inherit.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val version: String,
  /**
   * The relative path of the parent &lt;code&gt;pom.xml&lt;/code&gt; file within the check out.
  If not specified, it defaults to &lt;code&gt;../pom.xml&lt;/code&gt;.
  Maven looks for the parent POM first in this location on
  the filesystem, then the local repository, and lastly in the remote repo.
  &lt;code&gt;relativePath&lt;/code&gt; allows you to select a different location,
  for example when your structure is flat, or deeper without an intermediate parent POM.
  However, the group ID, artifact ID and version are still required,
  and must match the file in the location given or it will revert to the repository for the POM.
  This feature is only for enhancing the development in a local checkout of that project.
  Set the value to an empty string in case you want to disable the feature and always resolve
  the parent POM from the repositories.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "../pom.xml")
  val relativePath: String = "../pom.xml")
