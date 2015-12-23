package net.explorys.samhat.schema

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by stan.campbell on 12/23/15.
 */
class XmlToYamlSamSpec extends FlatSpec with Matchers {

  val instance = new XmlToYamlSam

  "An XmlToYamlSamSpec" should "be able to convert an XML spec file to a YAML spec file" in {

    instance.xmlToYamlFile("./src/test/resources/x12_schema_837_professional.xml", "/tmp/x12_schema_837_professional_out.yml")
  }

}
