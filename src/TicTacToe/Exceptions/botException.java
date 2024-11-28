package TicTacToe.Exceptions;

public class botException extends RuntimeException{
    public botException() {
    }

    public botException(String message) {
        super(message);
    }

    public botException(String message, Throwable cause) {
        super(message, cause);
    }

    public botException(Throwable cause) {
        super(cause);
    }

    public botException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
