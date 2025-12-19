package com.example.demo.controller;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.TimeStampEntity;

@RestController

public class TimeStampController{
    @Autowired TimeStampService ser;

    @PostMapping("/TS_post")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity stu){
        return ser.postData(stu);

    }
}