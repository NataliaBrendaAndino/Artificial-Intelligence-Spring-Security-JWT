package com.brenA.demojwt.myAI.exceptions;

public class FatalException extends RuntimeException {
    private static final String DESCRIPTION = "Internal server error";

    public FatalException(String detail) {
        super(detail + ". " + DESCRIPTION);
    }
}
