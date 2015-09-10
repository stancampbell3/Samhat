package net.explorys.samhat;

/**
 * Created by stan.campbell on 8/31/15.
 */
class AvroSchemaParsingException extends Exception {

    public AvroSchemaParsingException() {
    }

    public AvroSchemaParsingException(String message) {
        super(message);
    }

    public AvroSchemaParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public AvroSchemaParsingException(Throwable cause) {
        super(cause);
    }

    public AvroSchemaParsingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
