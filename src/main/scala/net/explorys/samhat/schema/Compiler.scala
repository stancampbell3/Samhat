package net.explorys.samhat.schema

trait YamlWriteable {

  def toYaml():String
}

trait Property[T] extends YamlWriteable {

  def getName():String
  def getValue():T

  def toYaml():String = getName() + " : " + getValue()
}

case class StringProperty(name:String, value:String) extends Property[String] {

  override def getName(): String = name
  override def getValue(): String = value

  override def toString: String = name + " : \"" + value +"\""
}

case class Loop(name:String, properties:List[Property[_]]) extends YamlWriteable {

  def toYaml():String = name + " : \n\t[\n" + (properties.map(p => "\t\t"+p.toYaml()+"\n")).mkString("\n") + "\n\t]\n"
}

case class LoopProperty(name:String, value:Loop) extends Property[Loop] {

  override def getName(): String = name
  override def getValue(): Loop = value

  override def toYaml():String = getName() + " : " + getValue().toYaml()
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
