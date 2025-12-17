package com.example.demo.entity
@Entity
public class StudentEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;
    


    public String getId(){
        return id;
    }
    public void setId(){
        this.id=id
    }


    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
;
    

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password=password;
    }







}