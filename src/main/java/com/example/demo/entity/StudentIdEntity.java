package com.example.demo.entity;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentIdEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private int cardNumber;

@OneToOne
@JoinColumn(name = "Student_id")
    private StudentDetailEntity student;
    

}