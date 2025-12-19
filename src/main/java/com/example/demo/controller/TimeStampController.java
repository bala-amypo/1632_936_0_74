package com.example.demo.controller;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class Controller{
    @Autowired TimeStampService ser;

    @PostMapping("/TS_post")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity stu){
        return ser.postData(stu);

    }
}