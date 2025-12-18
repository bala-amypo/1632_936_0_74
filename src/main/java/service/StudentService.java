package com.example.demo.service;

import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService{

    StudentEntity postData(StudentEntity stu);      //method declaration

    List<StudentEntity>getAllData();

    String DeleteData(int id);

    studentEntity GetData(int id);

    StudentEntity updateData(int id,StudentEntity entity);


}