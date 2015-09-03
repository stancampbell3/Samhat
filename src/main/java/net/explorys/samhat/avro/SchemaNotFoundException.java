package net.explorys.samhat.avro;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class SchemaNotFoundException extends Exception {

    public SchemaNotFoundException() {
    }

    public SchemaNotFoundException(String message) {
        super(message);
    }

    public SchemaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchemaNotFoundException(Throwable cause) {
        super(cause);
    }

    public SchemaNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
