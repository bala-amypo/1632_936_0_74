package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentIdService;

import com.example.demo.entity.StudentIdEntity;

import com.example.demo.repository.StudentIdRepository;



@Service


public class StudentIdServiceImpl implements StudentIdService{
    @Autowired StudentIdRepository student;

//definition

@Override
    public StudentIdEntity postData(StudentIdEntity stu){
        return student.save(stu);

    }
}