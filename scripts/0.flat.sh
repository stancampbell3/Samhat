#!/bin/bash
java -cp ../out/artifacts/Samhat_jar/Samhat.jar net.explorys.samhat.avro.Avro837Util flat ../src/test/resources/Flat837.avsc ../src/test/resources/ASC\ X12/005010/Technical\ Reports/Type\ 3/Finals/Examples/005010X223\ Health\ Care\ Claim\ Institutional/X223-837-institutional-claim.edi "TestOrg" 80 "Testfile" ./X223-837-institutional-claim.flat.avro
