package com.example.demo.controller;
import com.example.demo.service.StudentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentDetailEntity;

@RestController

public class StudentDetailController{
    @Autowired StudentDetailService ser;

    @PostMapping("/Student_post")
    public StudentDetailEntity sendData(@RequestBody StudentDetailEntity stu){
        return ser.postData(stu);

    }
}