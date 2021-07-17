package com.example.myapplication;

import android.util.Pair;

import java.util.ArrayList;

public class NgarigoQuiz {
    private static NgarigoQuiz instance = new NgarigoQuiz();
    private ArrayList<Question> questions;

    private NgarigoQuiz() {
        questions = new ArrayList<>();
        ArrayList<Pair<String, Boolean>> options = new ArrayList<>();
        options.add(new Pair("ŋaman", false));
        options.add(new Pair("warrumbul", false));
        options.add(new Pair("marinj", true));
        options.add(new Pair("galan", false));
        questions.add(new Question("What is \"man\" in ngarigo language?", options));

        options = new ArrayList<>();
        options.add(new Pair("djira-wadj", false));
        options.add(new Pair("ganj", false));
        options.add(new Pair("gudhaiar", false));
        options.add(new Pair("wanj", true));
        questions.add(new Question("What is \"child\" in ngarigo language?", options));

        options = new ArrayList<>();
        options.add(new Pair("gugan", false));
        options.add(new Pair("budira", true));
        options.add(new Pair("dumbug", false));
        options.add(new Pair("bullan", false));
        questions.add(new Question("What is \"doctor\" in ngarigo language?", options));
    }

    public static NgarigoQuiz getInstance() {
        return instance;
    }

    public static void resetQuiz() {
        instance = new NgarigoQuiz();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
