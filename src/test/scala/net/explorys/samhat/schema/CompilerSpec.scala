package net.explorys.samhat.schema

import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

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

}
