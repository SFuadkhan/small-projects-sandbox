package com.company;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static double score = 0.0;

    public static void main(String[] args){
        var main = new Main();
        var questionsFactory = new QuizFactory();
        var scanner = new Scanner(in);
        while (true) {
            if (questionsFactory.isQuestionsEnd()) {
                if (score < 0) score = 0;
                System.out.println("The Game is ended you score is = " + score);
                System.exit(0);
            }
            var question = questionsFactory.getRandomQuestion();
            main.showQuestion(question);
            main.checkAnswer(scanner, question);
        }
    }

    private void showQuestion(Quiz quiz) {
        System.out.printf("%S, \n", quiz.question());
        for (var i = 0; i < quiz.answers().length; i++) {
            System.out.println(i + " - " + quiz.answers()[i]);
        }
    }

    private void checkAnswer(Scanner scanner, Quiz quiz) {
        while (true) {
            var answer = scanner.nextInt();
            if (answer > quiz.answers().length || answer < 0) {
                System.out.println("answer is not exist, write the correct answer position");
            } else {
                if (quiz.rightAnswerPosition() == answer) {
                    score++;
                } else {
                    score -= 0.25;
                }
                break;
            }
        }
    }
}
