package com.example.services;

import com.example.entity.Question_Details;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface QuestionServices {

	public List<Question_Details> getAllQuestions();
	
	public Question_Details getQuestionById(int questionId);
	
	public Question_Details addQuestion(Question_Details question);
	
	public void deleteQuestion(int questionId);
	
	public Question_Details 
	updateQuestion(int questionId, Question_Details question);
}