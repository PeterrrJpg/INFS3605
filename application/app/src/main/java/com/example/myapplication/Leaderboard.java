package com.example.myapplication;

public class Leaderboard {
    private String username;
    private Integer highscore;
    private String profile;

    public Leaderboard(String username, Integer highscore, String profile) {
        this.username = username;
        this.highscore = highscore;
        this.profile = profile;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
