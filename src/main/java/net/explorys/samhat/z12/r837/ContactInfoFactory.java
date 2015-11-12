package net.explorys.samhat.z12.r837;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactInfoFactory {

    static ContactInfo newInstance(String[] args) {

        if(args.length<7) {
            throw new IllegalArgumentException("ContactInfo requires 7 arguments.");
        }
        return new ContactInfo(args[0], args[1], args[2], args[3], args[4], args[5], args[6] );
    }

    static ContactInfo newInstance(List<String> args) {

        return newInstance(args.toArray(new String[7]));
    }

    static ContactInfo newInstance(List<String> patternStrs, List<String> values) {

        List<String> args = new ArrayList<>();
        Iterator<String> itr = values.iterator();
        for( String patternStr : patternStrs ) {

            Pattern pattern = Pattern.compile(patternStr);

            Matcher matcher = pattern.matcher(itr.next());
            assert( matcher.find() );
            int groupCount = matcher.groupCount();

            for(int g=1;g<=groupCount;g++) {
                args.add( matcher.group(g) );
            }
        }

        return newInstance(args);
    }
}
