package com.example.demo.entity
@Entity
public class StudentEntity{
    private String name;
    private Integer id;
    private String email;
    private String password;
    private Date dob;

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public String getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.name=name;
    }





}