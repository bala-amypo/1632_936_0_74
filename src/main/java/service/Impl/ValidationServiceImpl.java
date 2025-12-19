package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.service.ValidationService;

import com.example.demo.entity.ValidationEntity;

import com.example.demo.repository.ValidationRepository;
//import java.util.List;


@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository validate;
    @Override
    public ValidationEntity postData(ValidationEntity valid){
        return validate.save(valid);

    }

    @Override
    public ValidationEntity GetData(Integer id){
        return validate.findById(id).orElseThrow(()-> new ValidationException("Invalid id" + id));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

}