package com.brenA.demojwt.myAI.exceptions;

public class InvalidWordException extends RuntimeException {
    private static final String DESCRIPTION = "The word is not a verb";

    public InvalidWordException(String detail) {
        super(detail + ". " + DESCRIPTION);
    }
}
