package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentIdEntity;

@Repository

public interface StudentIdRepository extends JpaRepository<StudentIdEntity,Long>{

}