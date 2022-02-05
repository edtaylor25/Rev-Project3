package com.example.services;


import com.example.entity.Quiz;
import com.example.repository.QuizRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuizServiceImpl implements QuizService{
    
    @Autowired
    private QuizRepository repository;

    @Override
    public List<Quiz> getAllQuizzes() {
        return repository.findAll();
    }

    @Override
    public Quiz getQuizById(int quiz_id) {
        return repository.findById(quiz_id).get();
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return repository.save(quiz);
    }

}
