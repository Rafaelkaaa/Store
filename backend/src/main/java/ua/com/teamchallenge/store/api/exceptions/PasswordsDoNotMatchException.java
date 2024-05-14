package ua.com.teamchallenge.store.api.exceptions;

public class PasswordsDoNotMatchException extends RuntimeException {

    public PasswordsDoNotMatchException(String message) {
        super(message);
    }
}