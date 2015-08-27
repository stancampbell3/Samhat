package net.explorys.samhat;

/**
 * Created by stan.campbell on 8/26/15.
 */
public class CfSchemaParsingException extends Exception {

    public CfSchemaParsingException() {
    }

    public CfSchemaParsingException(String message) {
        super(message);
    }

    public CfSchemaParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public CfSchemaParsingException(Throwable cause) {
        super(cause);
    }
}
