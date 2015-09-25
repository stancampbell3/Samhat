package net.explorys.samhat.avro.mr;

import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.generic.GenericData;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroValue;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by stan.campbell on 9/22/15.
 */
class Avro837FlatReducer extends Reducer<Text, Flat837, AvroKey<String>, AvroValue<Flat837>> {

    @Override
    protected void reduce(Text key, Iterable<Flat837> values, Context context) throws IOException, InterruptedException {

        System.out.println("DEBUG DEBUG");

        for(Object valueObj : values ) {

            GenericData.Record value = (GenericData.Record)valueObj;
            Flat837 record = Flat837.newBuilder()
                    .setSourceFilename(value.get("source_filename").toString())
                    .setIngestedTimestamp(Long.parseLong(value.get("ingested_timestamp").toString()))
                    .setOrganization(value.get("organization").toString())
                    .setData((ByteBuffer) value.get("data"))
                    .build();

            context.write(new AvroKey<String>(key.toString()), new AvroValue<Flat837>(record));
        }
    }
}
