package net.explorys.samhat.schema

trait YamlWriteable {

  def toYaml(indent:Int = 0):String
}

trait XmlWriteable {

  def toXml(indent:Int = 0):String
}

/**
 * A Property of type T which is expressible as both Yaml and Xml in a Samhat schema.
 *
 * @tparam T
 */
trait Property[T] extends YamlWriteable with XmlWriteable {

  def getName():String
  def getValue():T

  def toYaml(indent:Int = 0):String = (" " * indent) + getName() + " : " + getValue()
}

/**
 * All scalars are currently implemented as String properties.  Support for other scalars such as numerics to come.
 *
 * @param name
 * @param value
 */
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

/**
 * Ignored for the purposes of schema management, but useful as part of the description language.
 *
 * @param comment
 */
case class CommentProperty(comment:String) extends Property[String] {

  override def getName():String = "comment"
  override def getValue():String = comment

  override def toString():String = comment

  override def toYaml(indent:Int = 0): String = "# "+comment
  override def toXml(indent:Int = 0): String = "<!-- " + comment + "-->"
}

/**
 * A definition of a named set of properties including terminal segments and/or other Loops.
 *
 * @param name
 * @param properties
 */
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

/**
 * A definition of a portion of an X12 document containing other properties which may include other, nested Loops.
 *
 * @param name
 * @param value
 */
case class LoopProperty(name:String, value:Loop) extends Property[Loop] {

  override def getName(): String = name
  override def getValue(): Loop = value

  override def toYaml(indent:Int = 0):String = getValue().toYaml(indent)
  override def toXml(indent:Int = 0):String = getValue().toXml(indent)
}

/**
 * Represents an AST for a parsed Samhat schema description.
 *
 * @param loops
 * @param preamble
 */
case class SamhatSchema(val loops:List[Loop], val preamble:Option[String] = None) extends YamlWriteable with XmlWriteable {

  def toYaml(indent:Int = 0):String = (if(preamble.isDefined) "# " + preamble.get + "\n" else "") +
    "X12 :\n" + loops.map( loop => " - " + loop.toYaml(indent+1)).mkString("\n")

  def toXml(indent:Int = 0):String = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
    (if(preamble.isDefined) "\n<!-- " + preamble + " -->\n" else "") +
    "\n<x12_schema name=\"X12\">\n" +
    loops.map( _.toXml(indent+1) ).mkString("\n") +
    "</x12_schema>"
}

/**
 * Compiler for Samhat schema description files ".sam"
 *
 * YAML Grammar for Samhat Schema File:
 *
 * SamhatSchema -> Preamble "X12" ":" LoopEntries
 * Preamble -> CommentProperty | CommentProperty Preamble
 * LoopEntries -> Loop LoopEntries
 *   -> ε
 * Loop -> SamhatID ":" "{" PropertyDefList "}"
 * PropertyDefList -> PropertyDef
 *   -> PropertyDef "," PropertyDefList
 * PropertyDef -> StringProperty | LoopProperty | CommentProperty
 * StringProperty -> SamhatID ":" stringLiteral
 * LoopProperty -> Loop
 * SamhatID -> any valid Java identifier part (can start with underscores or numbers, case sensitive)
 */
class Compiler {

  private[Compiler] val parser = new SchemaParser

  def parse(yaml:String) = parser.parseAll(parser.schema, yaml)

  import scala.util.parsing.combinator._

  class SchemaParser extends JavaTokenParsers {

    // Helpful for formatting comments at the beginning of the file
    def preamble(commentsList:List[CommentProperty]):Option[String] = if(commentsList.isEmpty) None else Some( commentsList.mkString("\n") )

    // Samhat identifiers allow beginning numbers
    def samIdent: Parser[String] =
      """\p{javaJavaIdentifierPart}\p{javaJavaIdentifierPart}*""".r

    def stringProperty: Parser[StringProperty] = samIdent ~ ":" ~ stringLiteral ^^ { case x ~ ":" ~ y => StringProperty(x,y) }

    def commentProperty: Parser[CommentProperty] = "#" ~ stringLiteral ^^ { case "#" ~ comments => CommentProperty(comments) }

    def propertyDef: Parser[Property[_]] = (stringProperty | loopProperty | commentProperty)

    def propDefList: Parser[List[Property[_]]] = repsep(propertyDef, ",")

    def loop: Parser[Loop] = samIdent ~ ":" ~ "{" ~ propDefList ~ "}" ^^ { case id ~ ":" ~ "{" ~ props ~ "}" => Loop(id, props) }

    def loopProperty: Parser[LoopProperty] = loop ^^ { case loop => LoopProperty(loop.name, loop)}

    def loopEntry: Parser[Loop] = "-" ~ loop ^^ { case "-" ~ loopDef => loopDef }

    def schema: Parser[SamhatSchema] = rep(commentProperty) ~ "X12" ~ ":" ~ rep(loopEntry)  ^^ { case commentsList ~ "X12" ~ ":" ~ loops => SamhatSchema(loops, preamble(commentsList)) }
  }
}
