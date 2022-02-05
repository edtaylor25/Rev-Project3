package com.example.services;


import com.example.entity.Quiz;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface QuizService {
    public List<Quiz> getAllQuizzes();
    public Quiz getQuizById(int quiz_id);
    public Quiz addQuiz(Quiz quiz);


}
