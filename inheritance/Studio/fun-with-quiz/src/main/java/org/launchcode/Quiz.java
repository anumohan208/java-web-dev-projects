package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    protected ArrayList<Questions> questions = new ArrayList<>();

    public Quiz(ArrayList<Questions> questions) {
        this.questions = questions;
    }

    public void addQuestion(Questions question) {
        questions.add(question);
    }
}
