package net.explorys.samhat.avro.mr;

import jdk.nashorn.internal.runtime.Debug;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroValue;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by stan.campbell on 9/22/15.
 */
class Avro837FlatReducer extends Reducer<AvroKey<String>, AvroValue<GenericRecord>, AvroKey<String>, AvroValue<GenericRecord>> {

    @Override
    protected void reduce(AvroKey<String> key, Iterable<AvroValue<GenericRecord>> values, Context context) throws IOException, InterruptedException {

        for(AvroValue<GenericRecord> value : values ) {

            context.write(key, value);
        }
    }
}
