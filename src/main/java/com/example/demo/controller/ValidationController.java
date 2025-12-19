package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class ValidationController{
    @Autowired ValidationService ser;

    @PostMapping("/post_Validate")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity valid){
        return ser.postData(valid);

    }
    @GetMapping("/Validate_getid/{id}")
    public ValidationEntity getval(@PathVariable int id){
        return ser.GetData(id);
    }
}