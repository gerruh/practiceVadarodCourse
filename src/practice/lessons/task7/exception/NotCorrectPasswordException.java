package practice.lessons.task7.exception;

public class NotCorrectPasswordException extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
