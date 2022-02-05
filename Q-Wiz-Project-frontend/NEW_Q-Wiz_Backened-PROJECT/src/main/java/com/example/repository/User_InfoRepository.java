package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User_Info;

@Repository
public interface User_InfoRepository extends 
JpaRepository<User_Info,Integer> {

}
