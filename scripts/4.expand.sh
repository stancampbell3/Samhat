#!/bin/bash
java -cp ../out/artifacts/Samhat_jar/Samhat.jar net.explorys.samhat.avro.Avro837Util expand ./x12_schema_837_institutional_avro.json ./x12_schema_837_institutional.xml X223-837-institutional-claim.flat.avro X223-837-institutional-claim.expand.avro
