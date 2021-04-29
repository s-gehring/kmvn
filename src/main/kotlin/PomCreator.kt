package gehring.simon.kmvn;

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import gehring.simon.kvmn.model.CiManagement
import gehring.simon.kvmn.model.Model

fun main(args: Array<String>) {
    val xmlMapper: XmlMapper = XmlMapper()
    val model = Model(artifactId = "TestArtifact", groupId = "TestGroup", ciManagement = CiManagement("system", "url", CiManagement.Notifiers()))
    xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY)

    xmlMapper.writeValue(System.out, model)
}

class PomCreator {

}