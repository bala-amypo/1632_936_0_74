package com.example.demo.controller;
import com.example.demo.service.StudentIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.StudentIdEntity;

@RestController

public class StudentIdController{
    @AutowiredStudentIdService ser;

    @PostMapping("/Student_post")
    public StudentIdEntity sendData(@RequestBody StudentIdEntity stu){
        return ser.postData(stu);

    }
}