package com.example.myapplication;

import java.util.ArrayList;

public class Course {
    private String name;
    private Integer image;

    public Course(String name, Integer image) {
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

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("ALL", R.drawable.all));
        courses.add(new Course("Ngunnawal", R.drawable.ngunnawal));
        courses.add(new Course("Ngarigo", R.drawable.ngarigo));
        courses.add(new Course("Sample 1", R.drawable.sample));
        courses.add(new Course("Sample 2", R.drawable.sample));
        return courses;
    }
}
