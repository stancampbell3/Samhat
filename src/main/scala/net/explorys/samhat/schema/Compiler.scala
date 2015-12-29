package net.explorys.samhat.schema

trait YamlWriteable {

  def toYaml(indent:Int = 0):String
}

trait Property[T] extends YamlWriteable {

  def getName():String
  def getValue():T

  def toYaml(indent:Int = 0):String = ("\t" * indent) + getName() + " : " + getValue()
}

object StringProperty {

  val builtInProperties = Set("segment", "segmentQual", "segmentQualPos")
}

case class StringProperty(name:String, value:String) extends Property[String] {

  def isKnownProperty:Boolean = StringProperty.builtInProperties.contains(name)

  override def getName(): String = name
  override def getValue(): String = value

  override def toYaml(indent:Int = 0): String = ("\t" * indent) +
    (if(isKnownProperty) "_"+name else name) + " : \"" + value +"\""
}

case class Loop(name:String, properties:List[Property[_]]) extends YamlWriteable {

  def toYaml(indent:Int = 0):String = ("\t" * indent) + name + " : \n" + ("\t" * indent) +
    "[\n" + (properties.map(p => p.toYaml(indent+1)+"\n")).mkString("\n") +
    ("\t" * indent) +"]\n"
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
 * LOOP -> "id ":" "\n" "[" PROPDEFLIST "]"
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

    def propDefList: Parser[List[Property[_]]] = rep(propertyDef)

    def loop: Parser[Loop] = ident ~ ":" ~ "[" ~ propDefList ~ "]" ^^ { case id ~ ":" ~ "[" ~ props ~ "]" => Loop(id, props) }

    def loopProperty: Parser[LoopProperty] = loop ^^ { case loop => LoopProperty(loop.name, loop)}

    def schema: Parser[List[Loop]] = "X12" ~ ":" ~ "-" ~ rep(loop)  ^^ { case "X12" ~ ":" ~ "-" ~ loops => loops }
  }
}
