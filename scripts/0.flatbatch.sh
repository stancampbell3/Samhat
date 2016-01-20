#!/bin/bash

export CLASSPATH=.:..:/Users/stan.campbell/Development/Samhat/out/artifacts/Samhat_jar/Samhat.jar:./lib/avro-1.7.3.jar:./lib/avro-mapred-1.7.3.jar:./lib/hadoop-core-0.20.205.0.jar:./lib/jackson-core-asl-1.8.8.jar:./lib/jackson-mapper-asl-1.8.8.jar

for f in `cat edi.list.txt`
do
  echo "Processing $f..."
  export OUTFILE="./flat/$f.flat.avro"
  echo "Outfile $OUTFILE..."
  java net.explorys.samhat.avro.Avro837Util flat ../src/test/resources/Flat837.avsc ./edi/$f "TestOrg" 80 "$f" $OUTFILE 
done

