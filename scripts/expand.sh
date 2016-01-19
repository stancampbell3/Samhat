#!/bin/bash
export USER_DIR=/user/root/stan_tests
export HADOOP_CLASSPATH=lib/hadoop-core-0.20.205.0.jar:lib/avro-mapred-1.7.3.jar:lib/X12-V1.0.jar
echo Cleaning up explode directory
hdfs dfs -rm -r /user/root/stan_tests/avro/explode/TEST1/*
hdfs dfs -rmdir /user/root/stan_tests/avro/explode/TEST1
echo Running MR job...
yarn jar Samhat.jar net.explorys.samhat.avro.mr.Avro837Tool -libjars lib/hadoop-core-0.20.205.0.jar,lib/avro-mapred-1.7.3.jar,lib/X12-V1.0.jar $USER_DIR/avro/X223-837-institutional-claim.flat.avro $USER_DIR/avro/explode/TEST1 $USER_DIR/Flat837.avsc $USER_DIR/x12_schema_837_professional_avro.json $USER_DIR/x12_schema_837_professional.xml
echo Done!
