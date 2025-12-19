package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentDetailService;

import com.example.demo.entity.StudentDetailEntity;

import com.example.demo.repository.StudentDetailRepository;



@Service


public class StudentDetailServiceImpl implements StudentDetailService{
    @Autowired StudentDetailRepository student;

//definition

@Override
    public StudentDetailEntity postData(StudentdetailEntity stu){
        return student.save(stu);

    }
}