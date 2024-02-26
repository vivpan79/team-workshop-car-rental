package com.unibet.workshop.exception;

public class NoRegisteredCarException extends RuntimeException {
    public NoRegisteredCarException(String message) {
        super(message);
    }
}
