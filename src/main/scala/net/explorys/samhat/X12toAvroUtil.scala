package net.explorys.samhat

import net.explorys.common.data.patient.billing.X12ParserConfigurations
import org.pb.x12._

object X12_FORMAT extends Enumeration {
  type X12_FORMAT = Value
  val X12_837_PROFESSIONAL, X12_837_INSTITUTIONAL, X12_837_PAYMENTADVICE,
    X12_837_DENTAL, X12_837_PREDETERMPROF, X12_837_PREDETERMINST,
    X12_837_VERSION = Value
}

/**
 * Created by stan.campbell on 8/24/15.
 *
 * Accept a document representing a known transaction type (eg. X12 formatted 837 request) and write into a given
 * HDFS path, preserving the structure of the original X12 document.
 */
class X12toAvroUtil {

  import X12_FORMAT._

  // These may need correcting by updating X12ParserConfigurations
  val cfgMap:Map[X12_FORMAT, Cf] = Map(
    (X12_837_INSTITUTIONAL -> X12ParserConfigurations.getInstitutionalCf),
    (X12_837_PROFESSIONAL -> X12ParserConfigurations.getProfessionalCf),
    (X12_837_VERSION -> X12ParserConfigurations.getVersionCf),
    (X12_837_PAYMENTADVICE -> X12ParserConfigurations.getInstitutionalCf),
    (X12_837_DENTAL -> X12ParserConfigurations.getInstitutionalCf),
    (X12_837_PREDETERMPROF -> X12ParserConfigurations.getInstitutionalCf),
    (X12_837_PREDETERMINST -> X12ParserConfigurations.getInstitutionalCf)
  )

  /**
   * Parse the given data string and yield either Some(x12 document) or None
   *
   * @param data  the X12 formatted document to be parsed
   * @param documentType  the schema type we are to use to parse the document
   * @return
   */
  def parseX12Document(data:String, documentType:X12_FORMAT):Option[X12] = {

    val parser = new X12Parser(cfgMap(documentType))
    try {
      Some( parser.parse(data).asInstanceOf[X12] )
    } catch {
      case ex:Throwable => {
        // TODO: log the error
        None
      }
    }
  }

  /**
   * Parse the given data string and yield either Some(x12 document) or None
   *
   * @param data  the X12 formatted document data to parse
   * @param schema  the Cf schema to use to parse the X12 document
   * @return
   */
  def parseX12Document(data:String, schema:Cf):Option[X12] = {

    val parser = new X12Parser(schema)
    try {
      Some( parser.parse(data).asInstanceOf[X12])
    } catch {
      case ex:Throwable => {
        // TODO: log the error
        None
      }
    }
  }
}

object X12toAvroUtil {

  import collection.JavaConversions._ // ease of use, treat Java collections as if they were Scala collections

  // Useful for indenting printed output
  def repeat(s:String, n:Int):String = {
    val bld = new StringBuilder
    (0 until n).foreach( _ => bld.append(s) )
    bld.toString
  }

  // Our function for examining the parse tree
  def printLoop(loop:Loop):Unit = {
    val indent = repeat(" ",loop.getDepth)
    // this node's name
    println(indent + loop.getName())
    // this node's data
    loop.getSegments.foreach( segment => println( indent + " " + segment))
    // walk the children
    loop.getLoops().foreach( child => printLoop(child) )
  }

  /**
   * Apply the given function to each node of the parsed document, in order.
   *
   * @param x12 a node (possibly root) in the x12 parse tree.
   * @param f a function to apply to each node in the tree
   */
  def walkX12Document(x12:Loop, f:Loop => Unit):Unit = {

    import collection.JavaConversions._

    f(x12)
    x12.getLoops.foreach( child => walkX12Document(child, f))
  }

  def areEqual(a:Loop, b:Loop):Boolean = {

    if(a.getName()!=b.getName()) {
      false
    } else {
      a.getSegments.size == b.getSegments.size &&
        ( a.getSegments.size == 0 || a.getSegments.zip(b.getSegments).filter( p => p._1 != p._2).isEmpty ) &&
        a.getLoops.size == b.getLoops.size &&
        ( a.getLoops.size == 0 || a.getLoops.zip(b.getLoops).filter( p => !areEqual(p._1, p._2)).isEmpty )
    }
  }
}
