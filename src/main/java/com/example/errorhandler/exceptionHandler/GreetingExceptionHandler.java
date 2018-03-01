package com.example.errorhandler.exceptionHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GreetingExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { ArithmeticException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
//        String bodyOfResponse = "This should be application specific";
//        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
        System.out.println("Finishing logic in exception handler");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/arithmetic-exception");

        return handleExceptionInternal(ex, null, headers, HttpStatus.FOUND, request);
    }
}
