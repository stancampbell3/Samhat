package net.explorys.samhat;

import org.pb.x12.Cf;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by stan.campbell on 9/10/15.
 */
public interface ICfSchemaParser {

    /**
     * Concrete implementations will accept a Cf schema specification on the input stream and yield an instance of
     * Cf.
     *
     * @param schemaStream
     * @return
     * @throws CfSchemaParsingException
     */
    Cf parseSchema(InputStream schemaStream) throws CfSchemaParsingException;

    /**
     * Concrete implementations will accept a Cf schema specification on the filename path, and yield an instance of
     * Cf.
     *
     * @param filename
     * @return
     * @throws CfSchemaParsingException
     * @throws FileNotFoundException
     */
    Cf parseSchema(String filename) throws CfSchemaParsingException, FileNotFoundException;
}
