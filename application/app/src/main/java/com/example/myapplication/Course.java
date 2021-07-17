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
        courses.add(new Course("People", R.drawable.people));
        courses.add(new Course("Human Body", R.drawable.human_body));
        courses.add(new Course("Inanimate Nature", R.drawable.nature));
        courses.add(new Course("Mammal", R.drawable.mammal));
        courses.add(new Course("Bird", R.drawable.bird));
        courses.add(new Course("Fish", R.drawable.fish));
        courses.add(new Course("Reptile", R.drawable.reptile));
        courses.add(new Course("Plant", R.drawable.plant));
        return courses;
    }
}
