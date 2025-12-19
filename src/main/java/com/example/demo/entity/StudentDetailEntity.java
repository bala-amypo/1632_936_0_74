package com.example.demo.entity;


public class StudentDetailEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private  int registerNumber;
    private String address;

}