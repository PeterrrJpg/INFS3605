package com.example.myapplication;

import java.util.ArrayList;

public class Language {
    private String name;
    private Integer image;

    public Language(String name, Integer image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public static ArrayList<Language> getLanguages() {
        ArrayList<Language> language = new ArrayList<>();
        language.add(new Language("Ngunnawal", R.drawable.ngunnawal));
        language.add(new Language("Ngarigo", R.drawable.ngarigo));
        language.add(new Language("Sample 1", R.drawable.sample));
        language.add(new Language("Sample 2", R.drawable.sample));
        return language;
    }
}
