package org.launchcode;

public class MultipleChoice extends Questions{
    protected String[] options;
    protected String correctAnswer;

    public MultipleChoice(String question,String[] options, String correctAnswer) {
        super(question);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
