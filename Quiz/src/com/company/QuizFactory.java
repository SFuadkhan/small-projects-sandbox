package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuizFactory {

    private final List<Quiz> questions;
    private final List<Integer> releasedQuestionsPositions;
    private final Random random;

    public QuizFactory() {
        this.questions = initializeQuestions();
        this.releasedQuestionsPositions = new ArrayList<Integer>();
        this.random = new Random();
    }

    private List<Quiz> initializeQuestions() {
        var quizList = new ArrayList<Quiz>();
        try {
            parse(new String(Objects
                            .requireNonNull(getClass().getResourceAsStream("questions.txt"))
                            .readAllBytes())
                            .split(";"),
                    quizList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quizList;
    }

    private void parse(String[] questions, List<Quiz> questionsList) {
        for (var oneQ : questions) {
            var components = oneQ.split(",");
            String[] answers = new String[components.length - 2];
            for (int i = 1, j = 0; i < (components.length - 1); i++, j++) {
                answers[j] = components[i].trim();
            }
            var quiz = new Quiz(components[0], answers, Integer.parseInt(components[components.length - 1].trim()));
            questionsList.add(quiz);
        }

    }

    public Quiz getRandomQuestion() {
        var randomPosition = getRandomPosition();
        while (true) {
            if (randomPosition > this.questions.size() - 1) {
                randomPosition = getRandomPosition();
            }
            if (checkPosition(randomPosition)) {
                break;
            }
            randomPosition++;
        }
        this.releasedQuestionsPositions.add(randomPosition);
        return this.questions.get(randomPosition);
    }

    private int getRandomPosition() {
        return this.random.nextInt(this.questions.size());
    }

    private boolean checkPosition(int position) {
        return !this.releasedQuestionsPositions.contains(position);
    }

    public boolean isQuestionsEnd() {
        return this.questions.size() == this.releasedQuestionsPositions.size();
    }
}
