package com.example.myapplication;

import android.util.Pair;

import java.util.ArrayList;

public class Quiz {
    private static Quiz instance = new Quiz();
    private ArrayList<Question> questions;

    private Quiz() {
        questions = new ArrayList<>();
        ArrayList<Pair<String, Boolean>> options = new ArrayList<>();
        options.add(new Pair("BOBEL", false));
        options.add(new Pair("BUBAL", true));
        options.add(new Pair("BOWRAL", false));
        options.add(new Pair("LABEL", false));
        questions.add(new Question("What is \"boy\" in ngunnwal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("ŋumuŋ", false));
        options.add(new Pair("nhun", false));
        options.add(new Pair("yerra", false));
        options.add(new Pair("nyigity", true));
        questions.add(new Question("What is \"nose\" in ngunnwal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("mirri", true));
        options.add(new Pair("wagulan", false));
        options.add(new Pair("binit-binit", false));
        options.add(new Pair("gudamaŋ", false));
        questions.add(new Question("What is \"dog\" in ngunnwal language?", options));
    }

    public static Quiz getInstance() {
        return instance;
    }

    public static void resetQuiz() {
        instance = new Quiz();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
