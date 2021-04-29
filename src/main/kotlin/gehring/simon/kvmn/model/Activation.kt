package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * The conditions within the build runtime environment which will trigger the
 * automatic inclusion of the build profile. Multiple conditions can be defined, which must
 * be all satisfied to activate the profile.
 *
 * Java-Klasse für Activation complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Activation">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="activeByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 * &lt;element name="jdk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;element name="os" type="{http://maven.apache.org/POM/4.0.0}ActivationOS" minOccurs="0"/>
 * &lt;element name="property" type="{http://maven.apache.org/POM/4.0.0}ActivationProperty" minOccurs="0"/>
 * &lt;element name="file" type="{http://maven.apache.org/POM/4.0.0}ActivationFile" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activation", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Activation(

  /**
   * If set to true, this profile will be active unless another profile in this
  pom is activated using the command line -P option or by one of that profile&apos;s
  activators.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "false")
  val isActiveByDefault: Boolean = false,
  /**
   * Specifies that this profile will be activated when a matching JDK is detected.
  For example, &lt;code&gt;1.4&lt;/code&gt; only activates on JDKs versioned 1.4,
  while &lt;code&gt;!1.4&lt;/code&gt; matches any JDK that is not version 1.4. Ranges are supported too:
  &lt;code&gt;[1.5,)&lt;/code&gt; activates when the JDK is 1.5 minimum.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val jdk: String,
  /**
   * Specifies that this profile will be activated when matching operating system
  attributes are detected.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val os: ActivationOS,
  /**
   * Specifies that this profile will be activated when this system property is
  specified.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val property: ActivationProperty,
  /**
   * Specifies that this profile will be activated based on existence of a file.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
  val file: ActivationFile)
