package tech.sujitjayaraj.lexilearn.analysis.core;

public class LexiLearnException extends RuntimeException {
    public LexiLearnException(final String message) {
        super(message);
    }

    public LexiLearnException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
