package com.think41.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<String> exHandler(Think41Exception ex){

        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);

    }
}
