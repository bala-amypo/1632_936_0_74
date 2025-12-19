package com.example.demo.exception;

import.org.springframework.web.bind.annotation.ExceptionHandler;
import.org.springframework.web.bind.annotation.ResponseEntity;
import.org.springframework.web.bind.annotation.RestControllerAdvice;

@RestcontrollerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }

}