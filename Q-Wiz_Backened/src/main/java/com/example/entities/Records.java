package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

@Entity

@Table(name = "records")

public class Records {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int record_id;

	@ManyToOne
	@Column (name = "user_id")
	private int userId;
	
	@ManyToOne
	@Column (name = "quiz_id")
	private int quizId;
	
	@Column (name = "score")
	private int score;
}
