package net.explorys.samhat.z12.r837;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ContactInfoTest {

    String[] patternStrs = { "NM1\\*IL\\*1\\*([^\\*]+)\\*([^\\*]+)\\*.*",
            "N3\\*([^\\*]+).*",
            "N4\\*([^\\*]+)\\*([^\\*]+)\\*([^\\*]+)",
            "DMG\\*[^\\*]+\\*(\\d+)\\*F.*" };

    @Test
    public void canCreateContactInfoInstance() {

        try {

            String[] rawSegments = { "NM1*IL*1*JONES*SARAH*A***MI*012345678A",
                    "N3*1129 REINDEER ROAD",
                    "N4*CARR*CO*80612",
                    "DMG*D8*19630729*F" };

            List<String> args = new ArrayList<>();
            int i = 0;
            for( String patternStr : patternStrs ) {

                Pattern pattern = Pattern.compile(patternStr);

                Matcher matcher = pattern.matcher(rawSegments[i++]);
                assert( matcher.find() );
                int groupCount = matcher.groupCount();

                for(int g=1;g<=groupCount;g++) {
                    args.add( matcher.group(g) );
                }
            }

            for(String arg : args) {
                System.out.println("Arg: "+arg);
            }

            ContactInfo contactInfo = ContactInfoFactory.newInstance(args);
            assertNotNull(contactInfo);

        } catch(Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }
}
