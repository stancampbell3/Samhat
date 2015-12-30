package net.explorys.samhat.schema

trait YamlWriteable {

  def toYaml(indent:Int = 0):String
}

trait XmlWriteable {

  def toXml(indent:Int = 0):String
}

trait Property[T] extends YamlWriteable with XmlWriteable {

  def getName():String
  def getValue():T

  def toYaml(indent:Int = 0):String = (" " * indent) + getName() + " : " + getValue()
}

case class StringProperty(name:String, value:String) extends Property[String] {

  override def getName(): String = name
  override def getValue(): String = value

  override def toYaml(indent:Int = 0): String =
    name match {
      case "segment" | "segmentQual" | "segmentQualPos" | "classname" | "arity" => (" " * indent) + "_"+name+ " : \"" + value +"\""
        // patterns need to be escaped
      case "patterns" => (" " * indent) + "_"+name+ " : \"" + value.replace("\\", "\\\\") +"\""
      case _ => (" " * indent) + name+ " : \"" + value +"\""
    }

  override def toXml(indent:Int = 0): String = ""

}

case class Loop(name:String, properties:List[Property[_]]) extends YamlWriteable with XmlWriteable {

  def toYaml(indent:Int = 0):String = (" " * indent) + name + " : {\n" +
    (properties.map(p => p.toYaml(indent+1))).mkString(",\n") + "\n" +
    (" " * indent) +"}"

  def toXml(indent:Int = 0):String = {

    // a loop with no LoopProperties is an XML segment
    val loopProperties = properties.filter(_.isInstanceOf[LoopProperty])
    val scalarProperties = properties diff loopProperties

    def trimLeadingUnderscore(s:String) = if(s.startsWith("_")) s.substring(1) else s

    loopProperties.size match {
      case 0 => {
        // segment
        (" " * indent) + "<segment name=\"" + name + "\" " + scalarProperties.map( p => trimLeadingUnderscore(p.getName()) + "=" + p.getValue() ).mkString(" ") + "/>\n"
      }
      case _ => {
        // loop
        (" " * indent) + "<loop name=\"" + name + "\" " + scalarProperties.map( p => trimLeadingUnderscore(p.getName()) + "=" + p.getValue() ).mkString(" ") + ">\n" +
          loopProperties.map( _.toXml(indent+1) ).mkString("\n") +
          (" " * indent) + "</loop>"
      }
    }
  }
}

case class LoopProperty(name:String, value:Loop) extends Property[Loop] {

  override def getName(): String = name
  override def getValue(): Loop = value

  override def toYaml(indent:Int = 0):String = getValue().toYaml(indent)
  override def toXml(indent:Int = 0):String = getValue().toXml(indent)
}

case class SamhatSchema(val loops:List[Loop]) extends YamlWriteable with XmlWriteable {

  def toYaml(indent:Int = 0):String = "X12 :\n" + loops.map( loop => " - " + loop.toYaml(indent+1)).mkString("\n")
  def toXml(indent:Int = 0):String = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<x12_schema name=\"X12\">\n" + loops.map( _.toXml(indent+1) ).mkString("\n") + "</x12_schema>"
}

/**
 * Compiler for Samhat schema description files ".sam"
 *
 * YAML Grammar for Samhat Schema File:
 *
 * Schema -> "X12" ":" "\n" LOOP
 * LOOP -> "-" "id ":" "{" PROPDEFLIST "}"
 * PROPDEFLIST -> "id" ":" scalar "\n" [PROPDEFLIST]
 *             -> LOOP
 *             -> ""
 */
class Compiler {

  private[Compiler] val parser = new SchemaParser

  def parse(yaml:String) = parser.parseAll(parser.schema, yaml)

  import scala.util.parsing.combinator._

  class SchemaParser extends JavaTokenParsers {

    // Samhat identifiers allow beginning numbers
    def samIdent: Parser[String] =
      """\p{javaJavaIdentifierPart}\p{javaJavaIdentifierPart}*""".r

    def stringProperty: Parser[StringProperty] = samIdent ~ ":" ~ stringLiteral ^^ { case x ~ ":" ~ y => StringProperty(x,y) }

    def propertyDef: Parser[Property[_]] = (stringProperty | loopProperty)

    def propDefList: Parser[List[Property[_]]] = repsep(propertyDef, ",")

    def loop: Parser[Loop] = samIdent ~ ":" ~ "{" ~ propDefList ~ "}" ^^ { case id ~ ":" ~ "{" ~ props ~ "}" => Loop(id, props) }

    def loopProperty: Parser[LoopProperty] = loop ^^ { case loop => LoopProperty(loop.name, loop)}

    def loopEntry: Parser[Loop] = "-" ~ loop ^^ { case "-" ~ loopDef => loopDef }

    def schema: Parser[SamhatSchema] = "X12" ~ ":" ~ rep(loopEntry)  ^^ { case "X12" ~ ":" ~ loops => SamhatSchema(loops) }
  }
}
