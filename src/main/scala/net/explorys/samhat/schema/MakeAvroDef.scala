package net.explorys.samhat.schema

import net.explorys.samhat.DependencyGraph

class MakeAvroDef {

  val depends:DependencyGraph = new DependencyGraph()

  case class AvroEntryDef(classname: String, namespace: String,
                          fieldnames: List[String],
                          recordfields: List[(String, String)],
                          doc: String) {

    override def toString(): String = {

      val fields = (fieldnames.map(f => s"""\t{ "name" : "$f", "type" : "string" }""") :::
        recordfields.map(e => "\t{ \"name\" : \"" + e._1 + "\", \"type\" : \"" + namespace + "." + e._2 + "\" }"))
        .mkString(",\n")

      s"""{
  "type" : "record",
  "name" : "$classname",
  "namespace" : "$namespace",
  "fields" : [
$fields
  ]
}"""
    }
  }

  //	val xsd = "/Users/stan.campbell/Documents/837_Q1_Pro.xsd"
  //	val xml = scala.xml.XML.loadFile( xsd )
  //	val elements = xml.nonEmptyChildren.filter( _.label.equalsIgnoreCase("element") )
  //	val namespace = "net.explorys.samhat.z12.r837"

  def craftClassname(pre: String, s: String) = pre + s.substring(s.indexOf("_") + 1).toSeq.filter(c => c.isLetterOrDigit || c == '_').toString

  def getDocumentation(node: scala.xml.Node): String = (node \ "annotation" \ "documentation").head.text

  def craftFieldname(s: String) = "_" + s.substring(s.indexOf("_") + 1).replaceAll("_", "")

  def getFieldsList(node: scala.xml.Node): List[String] = (node \ "complexType").head
    .nonEmptyChildren.filter(_.label == "attribute")
    .map(_ \@ "name")
    .filter(!_.contains("NotUsed"))
    .map(s => craftFieldname(s)).toList

  /**
   * Crafts the fieldname and declared type and returns a list of 2-tuples
   * @param node
   * @param pre
   * @return
   */
  def getRecordFieldsList(node: scala.xml.Node, pre: String): List[(String, String)] = {
    val kids = (node \ "complexType" \ "sequence")
    if (kids.isEmpty)
      List.empty[(String, String)]
    else
      kids.head
        .nonEmptyChildren.filter(_.label == "element")
        .map(_ \@ "ref")
        .filter(!_.contains("NotUsed"))
        .map(s =>
        (craftFieldname(s), craftClassname(pre, s))
        ).toList
  }

  def makeAvroDef(node: scala.xml.Node, pre: String, namespace: String): AvroEntryDef = {

    val classname = craftClassname(pre, node \@ "name")
    val fields = getFieldsList(node)
    val recordFields = getRecordFieldsList(node, pre)
    val doc = getDocumentation(node)

    AvroEntryDef(classname, namespace, fields, recordFields, doc)
  }

  def recordDependencies(entry:AvroEntryDef):Unit = {
    import scala.collection.JavaConverters._
    depends.addDependencyEntries(entry.classname, entry.recordfields.map( _._2 ).asJava )
  }

}

object MakeAvroDef {
	def main(args:Array[String]):Unit = {
		
		if(args.size<3) {
			println("Usage: scala net.explorys.samhat.schema.MakeAvroDef <xml file> <prefix> <output_dir>")
			println("\tWhere <xml file> is a stylesheet describing the given schema.  It will be used to generate the Avro schemas.")
		} else {
		
			val xsd = args(0)
			val pre = args(1)
			val outputDir = args(2)
			
			val xml = scala.xml.XML.loadFile( xsd )
			val elements = xml.nonEmptyChildren.filter( _.label.equalsIgnoreCase("element") )

      val instance = new MakeAvroDef()

			elements.map( e => {
			    
				val entry = instance.makeAvroDef(e, pre, "net.explorys.samhat.z12.r837")
				
				val wtr = new java.io.BufferedWriter(new java.io.FileWriter(outputDir+java.io.File.separator+entry.classname+".avsc"))
				wtr.write(entry.toString)				
				wtr.close

        instance.recordDependencies(entry)
			})

      // Now, output the list of classes in dependency order.  The large final schema must be built in order.
      val dependencies:java.util.List[String] = instance.depends.getDependenciesInOrder
      println("\n\n**********************************************")
      val itr = dependencies.iterator()
      while(itr.hasNext) {
        val e = itr.next()
        println(e)
      }
		}	
	}

}
