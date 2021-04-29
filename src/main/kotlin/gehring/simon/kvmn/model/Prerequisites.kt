package gehring.simon.kvmn.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlType


/**
 * Describes the prerequisites a project can have.
 *
 * Java-Klasse für Prerequisites complex type.
 *
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Prerequisites">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;all>
 * &lt;element name="maven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 * &lt;/all>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prerequisites", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = [])
data class Prerequisites(

  /**
   * For a plugin project (packaging is &lt;code&gt;maven-plugin&lt;/code&gt;), the minimum version of
  Maven required to use the resulting plugin.&lt;br&gt;
  In Maven 2, this was also specifying the minimum version of Maven required to build a
  project, but this usage is &lt;b&gt;deprecated&lt;/b&gt; in Maven 3 and not checked any more: use
  the &lt;a href=&quot;https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html&quot;&gt;Maven Enforcer Plugin&apos;s
  &lt;code&gt;requireMavenVersion&lt;/code&gt; rule&lt;/a&gt; instead.
   */
  @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "2.0")
  val maven: String)