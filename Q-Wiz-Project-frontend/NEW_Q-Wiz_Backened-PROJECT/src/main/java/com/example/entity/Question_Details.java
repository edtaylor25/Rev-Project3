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




//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "question_details")
public class Question_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	@ManyToOne
	@JoinColumn(name = "quiz_id",
	referencedColumnName = "quizId")
	private Quiz quiz;
	 
	//private int quizId;
    
	@Column (name = "question")
	private String question;
	
	@Column (name = "question_type1")
	private String type1;

	@Column (name = "question_type2")
	private String type2;

	public String getQuestion() {
		
		return question;
	}


	public int getQuestion_id() {
		return questionId;
	}

	public void setQuestion_id(int question_id) {
		this.questionId = question_id;
	}

	//public int getQuizId() {
	//	return quizId;
	//}

	//public void setQuizId(int quizId) {
		//this.quizId = quizId;
	//}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}
