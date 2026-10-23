package mod4_exception.lesson51_custom_exceptions;

public class CourseIsNotValidException extends Exception {
    public CourseIsNotValidException(String message) {
        super(message);
    }

    public CourseIsNotValidException() {
    }
}
