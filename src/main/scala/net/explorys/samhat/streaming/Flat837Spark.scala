package net.explorys.samhat.streaming

import java.io.File

import org.apache.avro.Schema
import org.apache.avro.file.DataFileWriter
import org.apache.avro.generic.{GenericData, GenericDatumWriter, GenericRecord}
import org.apache.avro.io.DatumWriter
import org.apache.hadoop.fs.{FSDataOutputStream, Path, FileSystem}

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

      x837RDD.foreach ( data => {
        // util.writeX12FlatData(sourceFilename, System.currentTimeMillis, orgName, data, outputPath)
        val x837:GenericRecord = wrap837Data(sourceFilename, System.currentTimeMillis().toString,
          orgName, data, util.getX12FlatDataSchema)
        val fileSystem = FileSystem.get(ssc.sparkContext.hadoopConfiguration)
        writeFlat837Data( fileSystem, util.getX12FlatDataSchema, x837, outputPath)
      })
    })

    ssc.start()
    ssc.awaitTermination()
    // TODO: explicit termination and close on error
  }

  def writeFlat837Data(fileSystem:FileSystem, x12FlatDataSchema:Schema, x837:GenericRecord, outputPath:String) = {

    val datumWriter: DatumWriter[GenericRecord] = new GenericDatumWriter[GenericRecord]
    val dataFileWriter: DataFileWriter[GenericRecord] = new DataFileWriter[GenericRecord](datumWriter)

    val path:Path = new Path(fileSystem.getWorkingDirectory, outputPath)
    val fos:FSDataOutputStream = fileSystem.create(path)
    dataFileWriter.create(x12FlatDataSchema, fos)
    dataFileWriter.append(x837)
    dataFileWriter.flush()
    dataFileWriter.close()
  }

  def wrap837Data(sourceFile:String, ingestionTimestamp:String,
                  organization:String, data:String, x12FlatDataSchema:Schema):GenericRecord = {

    val x837: GenericRecord = new GenericData.Record(x12FlatDataSchema)
    x837.put("source_filename", sourceFile)
    x837.put("ingested_timestamp", ingestionTimestamp)
    x837.put("organization", organization)
    x837.put("data", data)

    x837
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
