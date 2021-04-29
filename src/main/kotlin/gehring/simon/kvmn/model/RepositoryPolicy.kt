package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Download policy.
 *
 * Java-Klasse für RepositoryPolicy complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RepositoryPolicy">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="updatePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="checksumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryPolicy", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class RepositoryPolicy(

  /**
   * Whether to use this repository for downloading this type of artifact. Note: While the type
  of this field is &lt;code&gt;String&lt;/code&gt; for technical reasons, the semantic type is actually
  &lt;code&gt;Boolean&lt;/code&gt;. Default value is &lt;code&gt;true&lt;/code&gt;.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val enabled: String,
  /**
   * The frequency for downloading updates - can be
  &lt;code&gt;always,&lt;/code&gt;
  &lt;code&gt;daily&lt;/code&gt;
  (default),
  &lt;code&gt;interval:XXX&lt;/code&gt;
  (in minutes) or
  &lt;code&gt;never&lt;/code&gt;
  (only if it doesn&apos;t exist locally).
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val updatePolicy: String,
  /**
   * What to do when verification of an artifact checksum fails. Valid values are
  &lt;code&gt;ignore&lt;/code&gt;
  ,
  &lt;code&gt;fail&lt;/code&gt;
  or
  &lt;code&gt;warn&lt;/code&gt;
  (the default).
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val checksumPolicy: String)