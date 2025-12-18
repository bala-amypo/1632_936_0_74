package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;



public class ValidationController{
    @Autowired ValidationService ser;

    @PostMapping("/post")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity valid){
        return ser.postData(valid);

    }
}