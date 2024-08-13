package com.quizapp;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    private Question[] questions;
    private int score;
    private Timer timer;
    private boolean timeUp;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
        this.timeUp = false;
    }

    public void startQuiz(int timeLimitInSeconds) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeUp = true;
                System.out.println("\nTime's up!");
                timer.cancel();
            }
        }, timeLimitInSeconds * 1000);

        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            if (timeUp) break;

            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (question.isCorrectAnswer(answer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            System.out.println();
        }

        if (!timeUp) {
            timer.cancel();
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
