package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {

    private Button btTest;
    private Button btLogOut;
    private Button btProfile;
    private Button btQuiz;
    private Button btLeaderboard;
    private Button btDictionary;

    private RecyclerView languageRecyclerview;
    private LanguageAdapter lAdapter;
    private RecyclerView.LayoutManager lLayoutManager;

    private RecyclerView courseRecyclerview;
    private CourseAdapter cAdapter;
    private RecyclerView.LayoutManager cLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageRecyclerview = findViewById(R.id.rvLanguage);
        languageRecyclerview.setHasFixedSize(true);
        lLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        languageRecyclerview.setLayoutManager(lLayoutManager);
        LanguageAdapter.Listener listener = new LanguageAdapter.Listener() {
            @Override
            public void onClick(View view, String name) {
                if (name.equals("Ngunnawal")) {
                    launchDictionaryPage();
                }
            }
        };

        lAdapter = new LanguageAdapter(new ArrayList<>(), listener);
        languageRecyclerview.setAdapter(lAdapter);
        lAdapter.setData(Language.getLanguages());

        courseRecyclerview = findViewById(R.id.rvCourse);
        courseRecyclerview.setHasFixedSize(true);
        cLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        courseRecyclerview.setLayoutManager(cLayoutManager);

        cAdapter = new CourseAdapter(new ArrayList<>());
        courseRecyclerview.setAdapter(cAdapter);
        cAdapter.setData(Course.getCourses());

        btTest = findViewById(R.id.btTest);
        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchTestPage();
            }
        });

        btLogOut = findViewById(R.id.btLogOut);
        btLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AuthUI.getInstance()
                        .signOut(getApplicationContext())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                launchAuthPage();
                            }
                        });
            }
        });

        btProfile = findViewById(R.id.btProfile);
        btProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchProfilePage();
            }
        });

        btQuiz = findViewById(R.id.btQuiz);
        btQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchQuizPage();
            }
        });

        btLeaderboard = findViewById(R.id.btLeaderboard);
        btLeaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchLeaderboardPage();
            }
        });

        btDictionary = findViewById(R.id.btDictionary);
        btDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDictionaryPage();
            }
        });
    }

    private void launchTestPage() {
        Intent intent = new Intent(MainPage.this, TestPage.class);
        startActivity(intent);
    }

    private void launchAuthPage() {
        Intent intent = new Intent(MainPage.this, AuthPage.class);
        startActivity(intent);
    }

    private void launchProfilePage() {
        Intent intent = new Intent(MainPage.this, ProfilePage.class);
        startActivity(intent);
    }

    private void launchQuizPage() {
        Intent intent = new Intent(MainPage.this, QuizPage.class);
        startActivity(intent);
    }

    private void launchLeaderboardPage() {
        Intent intent = new Intent(MainPage.this, LeaderboardPage.class);
        startActivity(intent);
    }

    private void launchDictionaryPage() {
        Intent intent = new Intent(MainPage.this, DictionaryPage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        finish();
        super.onBackPressed();
    }
}