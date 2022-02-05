package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.User_Info;
import com.example.services.User_InfoService;

@RestController
public class User_InfoController {
	
		@Autowired
		private User_InfoService service;
		
		@GetMapping("/user_info")
		public List<User_Info> getUser_Info() {
			return service.getAllUser_Info();
		}
		
		@GetMapping("/user_info{id}")
		public User_Info getUser_InfoById(@PathVariable("id") int id) {
			return service.getUser_InfoById(id);
		}
		
		@PostMapping("/user_info")
		public User_Info createUser_Info(@RequestBody User_Info user_info) {
		return service.addUser_Info(user_info);
		}
		
		@DeleteMapping("/user_info/{id}")
		public String deleteUser_Info(@PathVariable("id") int id) {
			service.deleteUser_Info(id);
			return "record has been deleted successfully";
			
		}
		
		@PutMapping("/user_info/{id}")
		public String updateUser_Info(@PathVariable("id") int id, @RequestBody User_Info user_info) {
		service.updateUser_Info(user_info);
		return "record updated successfully";
		}
}
		

	



