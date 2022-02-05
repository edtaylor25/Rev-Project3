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
@Table(name = "answer_details")
public class Choices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	
	@ManyToOne
	@JoinColumn(name = "quiz_id",
	referencedColumnName = "quizId")
	private Quiz quiz;
	//private int quizId;
	
	@ManyToOne
	@JoinColumn(name = "question_id", referencedColumnName = "questionId")
	private Question_Details questionRef;
	//private int questionId;
	
	@Column (name = "is_correct ")
	private boolean isCorrect;

	@Column (name = "answer")
	private String answer;
}
