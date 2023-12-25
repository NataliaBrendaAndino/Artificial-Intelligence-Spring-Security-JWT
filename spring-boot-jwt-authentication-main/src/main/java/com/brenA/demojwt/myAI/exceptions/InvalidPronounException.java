package com.brenA.demojwt.myAI.exceptions;

public class InvalidPronounException extends RuntimeException {
    private static final String DESCRIPTION = "The word is not a valid pronoun";

    public InvalidPronounException(String detail) {
        super(detail + ". " + DESCRIPTION);
    }
}
