package net.explorys.samhat.schema

import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source
import scala.xml.NodeSeq

/**
 * Defines the requirements of the Compiler class.
 */
class CompilerSpec extends FlatSpec with Matchers {

  val instance:Compiler = new Compiler

  def getTestYaml(filename:String):String = Source.fromInputStream(getClass().getResourceAsStream(filename)).getLines.mkString("\n")

  "A Samhat Schema Compiler" should "be able to parse a simple schema" in {

    val schemaYaml = getTestYaml("/simple_schema.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

  it should "be able to parse a schema with nested loops" in {

    val schemaYaml = getTestYaml("/simple_schema2.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

  it should "be able to parse a schema with multiple loops" in {

    val schemaYaml = getTestYaml("/simple_schema3.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

  it should "be able to parse a schema with comments" in {

    val schemaYaml = getTestYaml("/simple_schema4.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

  it should "be able to parse a schema with segment-field identifiers" in {

    val schemaYaml = getTestYaml("/simple_schema6.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

  it should "be able to generate well-formed XML from a schema with segment-field identifiers" in {

    val schemaYaml = getTestYaml("/simple_schema6.yml")
    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)

    val samhatSchema = ast.get

    val xmlStr:String = samhatSchema.toXml(0)

    xmlStr should not be null

    println(xmlStr)

    val xml:NodeSeq = scala.xml.parsing.XhtmlParser(Source.fromString(xmlStr))

    xml should not be null
  }

}
