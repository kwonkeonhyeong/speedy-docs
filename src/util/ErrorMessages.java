package util;

public enum ErrorMessages {

    ;

    private final String message;

    private static final String header = "[ERROR] ";

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return header + message;
    }
}
