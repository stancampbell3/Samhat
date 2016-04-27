package net.explorys.samhat.avro.mr;

/**
 * Created by stan.campbell on 3/17/16.
 */
public class CreateCurrentRecordException extends Exception {

    public CreateCurrentRecordException() {
        super();
    }

    public CreateCurrentRecordException(String message) {
        super(message);
    }

    public CreateCurrentRecordException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateCurrentRecordException(Throwable cause) {
        super(cause);
    }

    protected CreateCurrentRecordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
