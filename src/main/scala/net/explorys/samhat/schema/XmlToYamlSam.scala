package net.explorys.samhat.schema

import scala.xml.{Node, Elem}

class XmlSamParsingException(reason:String, cause:Throwable = null) extends Exception(reason, cause)

/**
 * Tool for converting XML-based Samhat specifications to YAML.
 */
class XmlToYamlSam {

  def knownLabel(label:String) = label.toLowerCase match {
    case "segment" => true
    case "loop" => true
    case _ => false
  }

  def parseXml(xml:Node):Loop = {

    xml.label.toLowerCase match {
      case "segment" => {
        val keys:List[String] = xml.attributes.asAttrMap.keys.toList.filter("name" != _)
        val props:List[StringProperty] = keys.map( key => StringProperty(key, xml.attribute(key).get.head.toString))
        Loop( xml.attribute("name").get.head.toString, props)
      }
      case "loop" => {
        val keys:List[String] = xml.attributes.asAttrMap.keys.toList.filter("name" != _)
        val strProps:List[StringProperty] = keys.map( key => StringProperty(key, xml.attribute(key).get.head.toString))
        val loopProps:List[LoopProperty] = xml.nonEmptyChildren.filter( kid => knownLabel(kid.label) ).map( kid => {
          LoopProperty(kid.label, parseXml(kid))
        }).toList
        Loop( xml.attribute("name").get.head.toString, strProps ::: loopProps)
      }
      case _ => throw new XmlSamParsingException("Couldn't parse XML, unknown element: "+xml.label.toLowerCase)
    }
  }

  def xmlToYaml(xml:Elem):Option[SamhatSchema] = {

    xml.label.toLowerCase match {
      case "x12_schema" => Some( SamhatSchema( xml.nonEmptyChildren.filter( kid => knownLabel(kid.label)).map(parseXml _).toList) )
      case _ => None
    }
  }

  def xmlToYamlFile(xmlFilename:String, yamlFilename:String):Unit = {

    val xml = scala.xml.XML.loadFile(xmlFilename)

    if(!"x12_schema".equalsIgnoreCase(xml.label)) {
      throw new XmlSamParsingException("A Samhat XML Schema must begin with the x12_schema element.")
    }

    try {

      val schema:Option[SamhatSchema] = xmlToYaml(xml)

      if(!schema.isDefined) {
        throw new XmlSamParsingException("Error with YAML AST generation")
      }

      val schemaAsString = schema.get.toYaml()

      // Write the file

      val outputFile = new java.io.File(yamlFilename)
      val outWtr = (new java.io.BufferedWriter(new java.io.FileWriter(outputFile)))
      outWtr.write( schemaAsString )
      outWtr.close()

    } catch {

      case ex:Throwable => throw new XmlSamParsingException("Couldn't convert XML to YAML Samhat spec", ex)
    }
  }
}
