package net.explorys.samhat.streaming

class Flat837Job(flatDataSchemaPath:String, sourceFilename:String, orgName:String, outputPath:String) extends Serializable {

  import java.nio.ByteBuffer

  import org.apache.spark.SparkConf
  import org.apache.spark.streaming.{Seconds, StreamingContext}

  import net.explorys.samhat.avro.Avro837Util

  val util: Avro837Util = new Avro837Util(flatDataSchemaPath)

  def run(): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("Flat837Spark")
    val ssc = new StreamingContext(conf, Seconds(10))

    // Create a DStream that will connect to hostname:port, like localhost:9999
    val lines = ssc.socketTextStream("localhost", 9999)

    val util: Avro837Util = new Avro837Util(flatDataSchemaPath)

    // Process documents
    lines.foreachRDD( x837RDD => {

      x837RDD.foreach ( x837 => {
        val bytes: Array[Byte] = x837.getBytes("utf-8")
        val data: ByteBuffer = ByteBuffer.wrap(bytes)
        util.writeX12FlatData(sourceFilename, System.currentTimeMillis, orgName, data, outputPath)
      })
    })

    ssc.start()
    ssc.awaitTermination()


    // TODO: explicit termination and close on error
  }
}

object Flat837Spark {

  def main(args:Array[String]) {

    // We'd actually parse for the X12 data here
    val flatDataSchemaPath: String = args(0)
    val orgName: String = args(1)

    // TODO: why is orgId fixed
    val orgId: String = args(2)
    val sourceFilename: String = args(3) // TODO: "needs to be passed with data packet"
    val outputPath: String = args(4)

    val job = new Flat837Job(flatDataSchemaPath, sourceFilename, orgName, outputPath)
    job.run() // Synchronous run
  }

}
