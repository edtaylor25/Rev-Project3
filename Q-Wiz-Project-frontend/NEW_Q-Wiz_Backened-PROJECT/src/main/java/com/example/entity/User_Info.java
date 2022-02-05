package com.example.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//ORM ( Object Relational Mapping )


//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class User_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "userId", targetEntity = Quiz.class, fetch = FetchType.LAZY)
	private int userId;

	@Column (name = "user_name", unique = true)
	private String userName;
	
	@Column (name = "first_name")
	private String first_name;
    
	@Column (name = "last_name")
	private String last_name;
	
	@Column (name = "email")
	private String email;

	@Column (name = "password")
	private String passWord;
	
	

	public User_Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Info(int user_id, String userName, String first_name, String last_name, String email, String passWord) {
		super();
		this.userId = user_id;
		this.userName = userName;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.passWord = passWord;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
