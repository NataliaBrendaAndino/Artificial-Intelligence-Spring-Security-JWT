package com.brenA.demojwt.myAI.exceptions;

public class ShortStringException extends RuntimeException {
    private static final String DESCRIPTION = "The verb must have two or more letters";

    public ShortStringException(String detail) {
        super(detail + ". " + DESCRIPTION);
    }

}
