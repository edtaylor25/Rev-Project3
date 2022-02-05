package com.example.services;

import com.example.entity.User_Info;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface User_InfoService {
	public List<User_Info>getAllUser_Info();
	public User_Info getUser_InfoById(int id);
	public User_Info addUser_Info(User_Info user_info);
	public User_Info deleteUser_Info(int id);
	public User_Info updateUser_Info(User_Info user_info);
	public User_Info login(String email, String password);
	
}
