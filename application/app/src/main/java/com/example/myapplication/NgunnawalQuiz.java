package com.example.myapplication;

import android.util.Pair;

import java.util.ArrayList;

public class NgunnawalQuiz {
    private static NgunnawalQuiz instance = new NgunnawalQuiz();
    private ArrayList<Question> questions;

    private NgunnawalQuiz() {
        questions = new ArrayList<>();
        ArrayList<Pair<String, Boolean>> options = new ArrayList<>();
        options.add(new Pair("BOBEL", false));
        options.add(new Pair("BUBAL", true));
        options.add(new Pair("BOWRAL", false));
        options.add(new Pair("LABEL", false));
        questions.add(new Question("What is \"boy\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("ŋumuŋ", false));
        options.add(new Pair("nhun", false));
        options.add(new Pair("yerra", false));
        options.add(new Pair("bullan", true));
        questions.add(new Question("What is \"woman\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("gudhaiar", true));
        options.add(new Pair("wagulan", false));
        options.add(new Pair("binit-binit", false));
        options.add(new Pair("gudamaŋ", false));
        questions.add(new Question("What is \"children\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("binit-binit", false));
        options.add(new Pair("dulwa", false));
        options.add(new Pair("bunduluk", false));
        options.add(new Pair("budyan", true));
        questions.add(new Question("What is \"bird\" in ngunnawal language?", options));

        options = new ArrayList<>();
        options.add(new Pair("yerrabi", false));
        options.add(new Pair("buddai", false));
        options.add(new Pair("binit-binit", false));
        options.add(new Pair("ger", true));
        questions.add(new Question("What is \"sick\" in ngunnawal language?", options));
    }

    public static NgunnawalQuiz getInstance() {
        return instance;
    }

    public static void resetQuiz() {
        instance = new NgunnawalQuiz();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
