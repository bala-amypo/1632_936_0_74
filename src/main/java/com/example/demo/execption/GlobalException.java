package com.example.demo.exception;

import.org.springframework.web.bind.annotation.ExceptionHandler;
import.org.springframework.web.bind.annotation.
import.org.springframework.web.bind.annotation.RestControllerAdvice;

@RestcontrollerAdvice
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(){

    }

}