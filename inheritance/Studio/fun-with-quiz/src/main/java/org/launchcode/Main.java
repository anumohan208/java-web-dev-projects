package org.launchcode;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Questions q1= new MultipleChoice("What color is apple:?",new String[] {"red","yellow","orange"},"red");

    ArrayList<Questions> questions = new ArrayList<>();
    questions.add(q1);
    Quiz quiz=new Quiz(questions);
        System.out.println(q1.question);

    }
}