import { Injectable } from '@angular/core';
import { Quiz } from './quiz.model';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  quizzes = [
    {

      question: 'What is Java?',
      answer: [

        { option: 'It is a general-purpose, class-based, object-oriented programming language.', correct: true},
        { option: 'It is a developer’s favorite go to drink in the morning to wake up.', correct: false},
        { option: 'It is America’s favorite TV show currently on Netflix.', correct: false},
        { option: 'None of the above.', correct: false}

      ]

    },
    {

      question: 'What does JVM stand for?',
      answer: [

        { option: 'Java Virtual Machine', correct: true},
        { option: 'Java Vital Mechanism', correct: false},
        { option: 'Java Vital Machine', correct: false},
        { option: 'None of the above.', correct: false}

      ]

    },
    {

      question: 'What is JVM?',
      answer: [

        { option: 'It loads, verifies  and executes Java bytecode. ', correct: true},
        { option: 'It is known as the interpreter or the core of Java programming.', correct: true},
        { option: 'It is a top of the line coffee maker for developers.', correct: false},
        { option: 'None of the above.', correct: false}

      ]

    },
    {

      question: 'What is Angular?',
      answer: [

        { option: 'The winning angle you need to wash windows.', correct: false},
        { option: 'A component-based framework for building scale-able web applications.', correct: true},
        { option: 'A collection of well-integrated libraries that cover a wide variety of features, including routing, forms management, client-server communication, and more.', correct: true},
        { option: 'None of the above.', correct: false}

      ]

    },
    {

      question: 'Why should we use Angular?',
      answer: [

        { option: 'It saves time for window washers.', correct: false},
        { option: 'Angular helps build interactive and dynamic single page applications (SPAs) through features like templating, two-way binding, modularization, RESTful API handling, dependency injection, and AJAX handling.', correct: true},
        { option: 'It helps developers brew their coffee in the morning.', correct: false},
        { option: 'None of the above.', correct: false}

      ]

    },
    {

      question: 'What is a component in Angular?',
      answer: [

        { option: 'A popular computer type for developers.  ', correct: false},
        { option: 'A subset of directives, always associated with a template. Only one component can be instantiated for a given element in a template.', correct: true},
        { option: 'A component must belong to an NgModule in order for it to be available to another component or application. ', correct: true},
        { option: 'None of the above', correct: false}

      ]

    }


  ]

  constructor() { }

getQuizzes(){
  return this.quizzes;
}


}
