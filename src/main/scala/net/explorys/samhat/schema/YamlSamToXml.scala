package net.explorys.samhat.schema

import scala.xml.{Node, Elem}

class YamlSamParsingException(reason:String, cause:Throwable = null) extends Exception(reason, cause)

/**
 * Utility for converting YAML schemas into XML
 */
class YamlSamToXml {

  def yamlToXmlFile(yamlFilename:String, xmlFilename:String):Unit = {

    val yaml = scala.io.Source.fromFile(yamlFilename).getLines().mkString("\n")

    val compiler = new Compiler

    val schemaOpt = compiler.parse(yaml)

    if(!schemaOpt.successful) throw new YamlSamParsingException("Couldn't parse the YAML Samhat file.")

    val xmlStr:String = schemaOpt.get.toXml()

    // Write the file
    val outputFile = new java.io.File(xmlFilename)
    val outWtr = (new java.io.BufferedWriter(new java.io.FileWriter(outputFile)))
    outWtr.write( xmlStr )
    outWtr.close()
  }

}
