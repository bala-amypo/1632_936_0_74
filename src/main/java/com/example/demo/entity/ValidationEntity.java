package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.size;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;


@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull

    @Size(min=2,max=10,message = "must be 2 to 10 character")
    private String username;
    @NotNull
    @Email(message = "Email is not valid")
    private String email;

    @Size(min=2,max=8,message ="must be a 2 to 8 character")
    @NotNull(message ="Password is mandatory")

    private String password;
    @Max(30)
    @Positive(message = "Message must be a positive number")

    @NotNull
    private int age;

public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

public String getuserName(){
        return username;
    }
    public void setName(String username){
        this.username=username;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public ValidationEntity(Long id,
    @NotNull 
    @Size(min=2,max=10,message ="must be a 2 to 10 character")
    String username,
    @NotNull
    @Email(message = "Email is not valid") String email;
    @Size(min=2,max=8,message ="must be a 2 to 8 character")
    @NotNull(message ="Password is mandatory")
    String password;
    @NotNull@Max(30)
    @Positive(message = "Message must be a positive number")

    
    int age;
    {
        this.id=id;
        this.username=username;
        this.password=password;
        this.age=age;
    }


public ValidationEntity(){

}

}