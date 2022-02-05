package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private int recordId;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User_Info userInfo;
	
	@ManyToOne
	@JoinColumn(name = "quiz_id", referencedColumnName = "quizId")
	private Quiz quizRef;
	
	@Column (name = "score")
	private int score;

	@Column (name = "points")
	private int points;
}
