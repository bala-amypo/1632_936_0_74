package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.size;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Email;


@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull

    @Size(min=2,max=10,message = "must be 2 to 10 character")
    private String username;

    @Email(message = "Email is not valid")
    private String email;

    @Size(min=2,max=10,message ="must be a 2 to 10 character")
    @NotNull(message ="Password is mandatory")

    private String password;

    @Max(30)
    @Positive(message = "Message must be a positive number")
    private int age;





}