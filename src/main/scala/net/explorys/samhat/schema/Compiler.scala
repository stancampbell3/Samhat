package net.explorys.samhat.schema

trait YamlWriteable {

  def toYaml(indent:Int = 0):String
}

trait Property[T] extends YamlWriteable {

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
}

case class Loop(name:String, properties:List[Property[_]]) extends YamlWriteable {

  def toYaml(indent:Int = 0):String = (" " * indent) + name + " : {\n" +
    (properties.map(p => p.toYaml(indent+1))).mkString(",\n") + "\n" +
    (" " * indent) +"}"
}

case class LoopProperty(name:String, value:Loop) extends Property[Loop] {

  override def getName(): String = name
  override def getValue(): Loop = value

  override def toYaml(indent:Int = 0):String = getValue().toYaml(indent)
}

/**
 * Compiler for Samhat schema description files ".sam"
 *
 * YAML Grammar for Samhat Schema File:
 *
 * Schema -> "X12" ":" "\n" "-" LOOP
 * LOOP -> "id ":" "{" PROPDEFLIST "}"
 * PROPDEFLIST -> "id" ":" scalar "\n" [PROPDEFLIST]
 *             -> LOOP
 *             -> ""
 */
class Compiler {

  private[Compiler] val parser = new SchemaParser

  def parse(yaml:String) = parser.parseAll(parser.schema, yaml)

  import scala.util.parsing.combinator._

  class SchemaParser extends JavaTokenParsers {

    def stringProperty: Parser[StringProperty] = ident ~ ":" ~ stringLiteral ^^ { case x ~ ":" ~ y => StringProperty(x,y) }

    def propertyDef: Parser[Property[_]] = (stringProperty | loopProperty)

    def propDefList: Parser[List[Property[_]]] = repsep(propertyDef, ",")

    def loop: Parser[Loop] = ident ~ ":" ~ "{" ~ propDefList ~ "}" ^^ { case id ~ ":" ~ "{" ~ props ~ "}" => Loop(id, props) }

    def loopProperty: Parser[LoopProperty] = loop ^^ { case loop => LoopProperty(loop.name, loop)}

    def schema: Parser[List[Loop]] = "X12" ~ ":" ~ "-" ~ rep(loop)  ^^ { case "X12" ~ ":" ~ "-" ~ loops => loops }
  }
}
