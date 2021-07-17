package com.example.myapplication;

import android.util.Pair;

import java.util.ArrayList;

public class AllQuiz {
    private static  AllQuiz instance = new AllQuiz();
    private ArrayList<Question> questions;

    private AllQuiz() {
        questions = new ArrayList<>();
        ArrayList<Pair<String, Boolean>> options = new ArrayList<>();
        options.add(new Pair("gamburra", true));
        options.add(new Pair("binnan", false));
        options.add(new Pair("gunuŋ", false));
        options.add(new Pair("middyuŋ", false));
        questions.add(new Question("What is \"flower\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("ganjgruŋ", false));
        options.add(new Pair("bullan", false));
        options.add(new Pair("bugila", false));
        options.add(new Pair("man", true));
        questions.add(new Question("What is \"wife\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("ninj", false));
        options.add(new Pair("mirigan", true));
        options.add(new Pair("bargaŋ", false));
        options.add(new Pair("ŋamal", false));
        questions.add(new Question("What is \"dog\" in ngarigo language?", options));
    }

    public static AllQuiz getInstance() {
        return instance;
    }

    public static void resetQuiz() {
        instance = new AllQuiz();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
