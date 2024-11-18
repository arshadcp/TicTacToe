package Builder;

public class gradYearNotValidException extends RuntimeException{
    public gradYearNotValidException() {
    }

    public gradYearNotValidException(String message) {
        super(message);
    }

    public gradYearNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public gradYearNotValidException(Throwable cause) {
        super(cause);
    }

    public gradYearNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
