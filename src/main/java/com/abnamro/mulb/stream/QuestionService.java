package com.abnamro.mulb.stream;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];
    int score = 0;

    public void displayQuestions() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris",
                "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Berlin",
                "London", "Paris", "Madrid", "Berlin");
        questions[2] = new Question(3, "What is the capital of Spain?", "Madrid",
                "London", "Berlin", "Paris", "Madrid");
        questions[3] = new Question(4, "What is the capital of Italy?", "Rome",
                "London", "Berlin", "Madrid", "Rome");
        questions[4] = new Question(5, "What is the capital of UK?",
                "London", "Berlin", "Madrid", "Paris", "London");
        playQuiz();
    }

    private void playQuiz() {
        int i =0;
        for (Question question : questions) {
                System.out.println("Question ID: " + question.getId());
                System.out.println("Question: " + question.getQuestion());
                System.out.println("Option 1: " + question.getOpt1());
                System.out.println("Option 2: " + question.getOpt2());
                System.out.println("Option 3: " + question.getOpt3());
                System.out.println("Option 4: " + question.getOpt4());
                Scanner sc = new Scanner(System.in);
                selection[i++] = sc.nextLine();
        }
        for(int j=0; j<5; j++) {
            if(selection[j].equalsIgnoreCase(questions[j].getAnswer())) {
                score++;
            }
            System.out.println("You selected: " + selection[j]+" and the correct answer is: " + questions[j].getAnswer());

        }
        System.out.println("Your score is: " + score);
    }
}
