package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Question_Details;
import com.example.services.QuestionServices;

@RestController
public class QuestionController {

	@Autowired
	private QuestionServices service;

	@GetMapping("/questions")
	public List<Question_Details> getQuestions() {
		return service.getAllQuestions();
	}

	@PostMapping("/create-quiz")
	public Question_Details createQuestion(@RequestBody Question_Details question) {
		return service.addQuestion(question);
	}

	@DeleteMapping("/create-quiz/{questionId}")
	public String deleteQuestion(@PathVariable("questionId") int questionId) {
		service.deleteQuestion(questionId);
		return "Question was deleted successfully";
	}

	@PutMapping("/create-quiz/{questionId}")
	public String updateQuestion(@PathVariable("questionId") int questionId,
			@RequestBody Question_Details question) {
		service.updateQuestion(questionId, question);
		return "Question updated successfully";
	}

}
