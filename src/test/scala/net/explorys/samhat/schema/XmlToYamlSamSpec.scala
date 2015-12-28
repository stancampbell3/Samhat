package net.explorys.samhat.schema

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by stan.campbell on 12/23/15.
 */
class XmlToYamlSamSpec extends FlatSpec with Matchers {

  val instance = new XmlToYamlSam
  val outputFilename = "/tmp/x12_schema_837_professional_out.yml"

  "An XmlToYamlSamSpec" should "be able to convert an XML spec file to a YAML spec file" in {

    // remove any existing output file
    val outputFile = new java.io.File(outputFilename)
    if(outputFile.exists()) {
      outputFile.delete()
    }

    instance.xmlToYamlFile("./src/test/resources/x12_schema_837_professional.xml", outputFilename)

    // the output file should exist now
    outputFile.exists() should be (true)
  }

}
