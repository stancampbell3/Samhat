package net.explorys.samhat.schema

import org.scalatest.{Matchers, FlatSpec}

import scala.io.Source

/**
 * Defines the requirements of the Compiler class.
 */
class CompilerSpec extends FlatSpec with Matchers {

  "A Samhat Schema Compiler" should "be able to parse a simple schema" in {

    val instance:Compiler = new Compiler

    val schemaYaml = Source.fromInputStream(getClass().getResourceAsStream("/simple_schema.yml")).getLines.mkString("\n")

    println("Target schema:\n'"+schemaYaml+"'")

    val ast = instance.parse(schemaYaml)

    println(ast)

    ast should not be null
    ast.successful should equal(true)
  }

}
