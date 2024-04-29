package org.launchcode;

public class Checkbox extends Questions {
    String[] options;
    String[] correctAnswers;

    public Checkbox(String question, String[] options, String[] correctAnswers) {
        super(question);
        this.options = options;
        this.correctAnswers = correctAnswers;
    }
}
