package net.explorys.samhat.schema

import java.util.Properties

/**
 * Compiler for Samhat schema description files ".sam"
 *
 * YAML Grammar for Samhat Schema File:
 *
 * Schema -> "X12" ":" "\n" "-" LOOP
 * LOOP -> "id ":" "\n" PROPS
 * PROPS -> "-" PROPDEFLIST
 * PROPDEFLIST -> "id" ":" scalar "\n" [PROPDEFLIST]
 *             -> LOOP
 */
class Compiler {

  private[Compiler] val parser = new SchemaParser

  def parse(yaml:String) = parser.parseAll(parser.schema, yaml)

  import scala.util.parsing.combinator._

  trait Property[T] {

    def getName():String
    def getValue():T
  }
  case class StringProperty(name:String, value:String) extends Property[String] {

    override def getName(): String = name
    override def getValue(): String = value
  }

  case class Loop(name:String, properties:List[Property[_]])

  case class LoopProperty(name:String, value:Loop) extends Property[Loop] {

    override def getName(): String = name
    override def getValue(): Loop = value
  }


  class SchemaParser extends JavaTokenParsers {
    def stringProperty: Parser[StringProperty] = ident ~ ":" ~ stringLiteral ^^ { case x ~ ":" ~ y => StringProperty(x,y) }
    def propertyDef: Parser[Property[_]] = (stringProperty | loopProperty)
    def propDefList: Parser[List[Property[_]]] = rep(stringProperty)
    def props: Parser[List[Property[_]]] = "-" ~ propDefList ^^ { case "-" ~ props => props }
    def loop: Parser[Loop] = ident ~ ":" ~ "-" ~ propDefList ^^ { case id ~ ":" ~ "-" ~ props => Loop(id, props) }
    def loopProperty: Parser[LoopProperty] = ident ~ ":" ~ loop ^^ { case id ~ ":" ~ loop => LoopProperty(id, loop)}
    def schema: Parser[List[Loop]] = "X12" ~ ":" ~ "-" ~ rep(loop)  ^^ { case "X12" ~ ":" ~ "-" ~ loops => loops }
  }
}
