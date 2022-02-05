package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Question_Details;

@Repository

public interface Question_Details_Repository extends 
JpaRepository<Question_Details, Integer> {

}