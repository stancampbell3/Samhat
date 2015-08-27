package net.explorys.samhat;

/**
 * CfSchemaTool
 *
 * Provide utilities for
 * 1.  Generating Avro schemas from input CfSchema XML definitions
 * 2.  Writing X12 837 documents as Avro records to HDFS using the supplied CfSchema XML definition
 */
public class CfSchemaTool {

    // The cfSchemaParser lets us
    CfSchemaParser cfSchemaParser = new CfSchemaParser();

}
