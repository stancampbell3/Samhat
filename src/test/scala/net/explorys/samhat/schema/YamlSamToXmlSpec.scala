package net.explorys.samhat.schema

import net.explorys.samhat.XmlBasedCfSchemaParser
import org.scalatest.{Matchers, FlatSpec}

class YamlSamToXmlSpec extends FlatSpec with Matchers {

  val instance = new YamlSamToXml
  val outputFilename = "/tmp/x12_schema_837_professional_out.xml"

  "An YamlSamToXml" should "be able to convert a YAML spec file to a valid XML spec file" in {

    // remove any existing output file
    val outputFile = new java.io.File(outputFilename)
    if(outputFile.exists()) {
      outputFile.delete()
    }

    instance.yamlToXmlFile("./src/test/resources/x12_schema_837_professional_out.yml", outputFilename)

    // the output file should exist now
    outputFile.exists() should be (true)

    // it should be a valid schema
    val xmlParser = new XmlBasedCfSchemaParser

    val cf = xmlParser.parseSchema(outputFilename)

    cf should not be (null)
    cf.hasChildren should be (true)
  }
}
