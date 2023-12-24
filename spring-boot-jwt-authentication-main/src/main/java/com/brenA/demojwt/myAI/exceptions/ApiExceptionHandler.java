package com.brenA.demojwt.myAI.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({ ShortStringException.class })
    @ResponseBody
    public ErrorMessage shortString(Exception exception) {
        // Print stack trace for debugging (remove in production)
        // Caution: Reveals sensitive info, may impact performance.
        exception.printStackTrace();
        return new ErrorMessage(exception, HttpStatus.NOT_FOUND.value());
    }

}