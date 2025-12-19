package com.example.demo.exception;

import.org.springframework.http.httpStatus;
import.org.springframework.web.bind.annotation.ExceptionHandler;
import.org.springframework.ResponseEntity;
import.org.springframework.web.bind.annotation.RestControllerAdvice;

@RestcontrollerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException ex){
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }

}