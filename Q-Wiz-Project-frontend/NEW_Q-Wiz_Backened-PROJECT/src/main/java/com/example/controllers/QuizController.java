package com.example.controllers;

    import com.example.entity.Quiz;
    import com.example.services.QuizService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;
    
    import java.util.List;
    
    @RestController
    public class QuizController {

        @Autowired
        private QuizService service;

        @GetMapping("/take-quiz")
        public List<Quiz> getQuizzes() {
            return service.getAllQuizzes();
        }

        // @GetMapping("/take-quiz/{quiz_id}")
        // public Quiz getQuizById(@PathVariable("quiz_id") int quiz_id){return
        // service.getQuizById(quiz_id);}
        //
        // @PostMapping("/create-quiz")
        // public Quiz createQuiz(@RequestBody Quiz quiz){return service.addQuiz(quiz);}
        //
    }
