package screenmatch.exceptions;

public class YearSizeException extends RuntimeException {
    private String message;
    public YearSizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
