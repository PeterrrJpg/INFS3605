package com.example.myapplication;

public class Leaderboard {
    private String username;
    private Integer highscore;

    public Leaderboard(String username, Integer highscore) {
        this.username = username;
        this.highscore = highscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getHighscore() {
        return highscore;
    }

    public void setHighscore(Integer highscore) {
        this.highscore = highscore;
    }
}
