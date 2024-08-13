package com.quizapp;

public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[] {
            new Question("What is the capital of France?", new String[] {"Berlin", "Madrid", "Paris", "Lisbon"}, 3),
            new Question("What is 5 + 7?", new String[] {"10", "12", "11", "13"}, 2),
            new Question("What is the largest planet in our Solar System?", new String[] {"Earth", "Mars", "Jupiter", "Venus"}, 3),
            new Question("Which language is used to create Android apps?", new String[] {"Python", "Java", "C#", "Ruby"}, 2)
        };

        Quiz quiz = new Quiz(questions);
        quiz.startQuiz(30); // 30 seconds time limit
    }
}
