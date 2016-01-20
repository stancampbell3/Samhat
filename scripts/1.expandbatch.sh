#!/bin/bash

export CLASSPATH=.:..:/Users/stan.campbell/Development/Samhat/out/artifacts/Samhat_jar/Samhat.jar:./lib/avro-1.7.3.jar:./lib/avro-mapred-1.7.3.jar:./lib/hadoop-core-0.20.205.0.jar:./lib/jackson-core-asl-1.8.8.jar:./lib/jackson-mapper-asl-1.8.8.jar:./lib/X12-V1.0.jar

for f in `cat flat.list.txt`
do
  echo "Processing $f..."
  export OUTFILE="./explode/$f.explode.avro"
  echo "Outfile $OUTFILE..."
  java net.explorys.samhat.avro.Avro837Util expand ./x12_schema_837_professional_avro.json ./x12_schema_837_professional.xml ./flat/$f ./explode/$f
done

