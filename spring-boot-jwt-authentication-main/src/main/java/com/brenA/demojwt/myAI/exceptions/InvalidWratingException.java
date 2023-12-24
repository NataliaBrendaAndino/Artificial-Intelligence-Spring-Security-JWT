package com.brenA.demojwt.myAI.exceptions;

public class InvalidWratingException extends RuntimeException {
    private static final String DESCRIPTION = "The word is not a verb";

    public InvalidWratingException(String detail) {
        super(detail + ". " + DESCRIPTION);
    }
}
