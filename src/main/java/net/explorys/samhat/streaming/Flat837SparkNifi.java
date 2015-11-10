package net.explorys.samhat.streaming;

import org.apache.nifi.remote.client.SiteToSiteClient;
import org.apache.nifi.remote.client.SiteToSiteClientConfig;
import org.apache.nifi.spark.NiFiDataPacket;
import org.apache.nifi.spark.NiFiReceiver;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import java.nio.charset.StandardCharsets;

/**
 * Created by stan.campbell on 10/25/15.
 */
public class Flat837SparkNifi {

  public static void main(String[] args) {

      SiteToSiteClientConfig config = new SiteToSiteClient.Builder()
              .url("http://localhost:8080/nifi")
              .portName("Data For Spark")
              .buildConfig();

      SparkConf sparkConf = new SparkConf().setAppName("Flat837SparkNifi");
      JavaStreamingContext ssc = new JavaStreamingContext(sparkConf, new Duration(1000L));

      // Create a JavaReceiverInputDStream using a NiFi receiver so that we can pull data from
      // specified Port
      JavaReceiverInputDStream packetStream =
              ssc.receiverStream(new NiFiReceiver(config, StorageLevel.MEMORY_ONLY()));

      // Map the data from NiFi to text, ignoring the attributes
      JavaDStream text = packetStream.map(new Function() {
          public String call(Object dataPacketObj) throws Exception {
              final NiFiDataPacket dataPacket = (NiFiDataPacket)dataPacketObj;
              return new String(dataPacket.getContent(), StandardCharsets.UTF_8);
          }
      });

      text.dstream().print();

      ssc.start();
      ssc.awaitTermination();
  }
}
