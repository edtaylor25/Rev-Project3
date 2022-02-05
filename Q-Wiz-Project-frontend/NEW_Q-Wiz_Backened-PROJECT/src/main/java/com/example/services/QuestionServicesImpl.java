package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Question_Details;
import com.example.entity.User_Info;
import com.example.repository.Question_Details_Repository;
import com.example.repository.User_InfoRepository;

@Service
public class QuestionServicesImpl implements QuestionServices {

	@Autowired
	private Question_Details_Repository repository;

	@Override
	public List<Question_Details> getAllQuestions() {
		return repository.findAll();
	}

	@Override
	public Question_Details getQuestionById(int questionId) {
		return repository.findById(questionId).get();
	}

	@Override
	public Question_Details addQuestion(Question_Details question) {
		return repository.save(question);
	}

	@Override
	public void deleteQuestion(int questionId) {
		repository.deleteById(questionId);
	}

	@Override
	public Question_Details updateQuestion(int id, Question_Details question) {
		Question_Details questiondb = repository.findById(id).get();
		questiondb.setQuestion(question.getQuestion());
		questiondb.setType1(question.getType1());
		questiondb.setType2(question.getType2());
		return repository.save(questiondb);
	}

}