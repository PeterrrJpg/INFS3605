package com.example.myapplication;

import android.util.Pair;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Pair<String, Boolean>> options;

    public Question(String question, ArrayList<Pair<String, Boolean>> options) {
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Pair<String, Boolean>> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Pair<String, Boolean>> options) {
        this.options = options;
    }
}
