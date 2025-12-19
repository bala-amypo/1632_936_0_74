package com.example.demo.entity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist; 
import jakarta.persistence.PreUpdate; 

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @PrePersist
    LocalDateTime now = LocalDateTime().now();

    public void Oncreate(){
        this.createAt=now;
        this.updateAt=now;
    }
 @PreUpdate
    public void Onupdate(){
        this.updateAt = now;
    }

}