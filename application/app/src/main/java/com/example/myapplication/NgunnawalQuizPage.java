package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NgunnawalQuizPage extends AppCompatActivity {
    private NgunnawalQuiz quiz;
    private int score;
    private CountDownTimer timer;
    private int timerCount;
    private int currentQuestion;
    private final int ONE_SECOND = 1000;
    private final int GAME_TIME = 30000;

    private TextView tvQuestion;
    private TextView tvTimer;
    private Button btOption1;
    private Button btOption2;
    private Button btOption3;
    private Button btOption4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngunnawal_quiz_page);

        tvQuestion = findViewById(R.id.tvQuestionNgunnawal);
        tvTimer = findViewById(R.id.tvTimerNgunnawal);
        btOption1 = findViewById(R.id.btOption1Ngunnawal);
        btOption2 = findViewById(R.id.btOption2Ngunnawal);
        btOption3 = findViewById(R.id.btOption3Ngunnawal);
        btOption4 = findViewById(R.id.btOption4Ngunnawal);

        quiz = NgunnawalQuiz.getInstance();
        score = 0;
        currentQuestion = 0;
        timerCount = 0;
        timer = new CountDownTimer(GAME_TIME, ONE_SECOND) {
            @Override
            public void onTick(long l) {
                if ((l / ONE_SECOND) <= 10) {
                    tvTimer.setTextColor(Color.RED);
                }
                tvTimer.setText(String.valueOf(l / ONE_SECOND));
                timerCount++;
            }

            @Override
            public void onFinish() {
                launchMainPage();
            }
        }.start();

        tvQuestion.setText(quiz.getQuestions().get(currentQuestion).getQuestion());
        btOption1.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(0).first);
        btOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitAnswer(0);
            }
        });
        btOption2.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(1).first);
        btOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(1);
            }
        });
        btOption3.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(2).first);
        btOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(2);
            }
        });
        btOption4.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(3).first);
        btOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(3);
            }
        });
    }

    @Override
    public void onBackPressed() {
        quitQuiz();
    }

    private void launchMainPage() {
        Toast.makeText(NgunnawalQuizPage.this, "You ran out of time!", Toast.LENGTH_SHORT).show();
        NgunnawalQuiz.resetQuiz();
        timer.cancel();
        Intent intent = new Intent(NgunnawalQuizPage.this, MainPage.class);
        startActivity(intent);
    }

    private void quitQuiz() {
        Toast.makeText(NgunnawalQuizPage.this, "Quiz Aborted", Toast.LENGTH_SHORT).show();
        NgunnawalQuiz.resetQuiz();
        timer.cancel();
        Intent intent = new Intent(NgunnawalQuizPage.this, MainPage.class);
        startActivity(intent);
    }

    private void submitAnswer(int option) {
        if (quiz.getQuestions().get(currentQuestion).getOptions().get(option).second == true) {
            score++;
            if (quiz.getQuestions().size() - (currentQuestion + 1) > 0) {
                currentQuestion++;
                loadNextQuestion();
                Toast.makeText(NgunnawalQuizPage.this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                timer.cancel();
                launchResultsPage("ngunnawal");
            }
        } else {
            Toast.makeText(NgunnawalQuizPage.this, "Incorrect", Toast.LENGTH_SHORT).show();
            timer.cancel();
            launchResultsPage("ngunnawal");
        }
    }

    private void loadNextQuestion() {
        tvQuestion.setText(quiz.getQuestions().get(currentQuestion).getQuestion());
        btOption1.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(0).first);
        btOption2.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(1).first);
        btOption3.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(2).first);
        btOption4.setText(quiz.getQuestions().get(currentQuestion).getOptions().get(3).first);
    }

    private void launchResultsPage(String language) {
        Intent intent = new Intent(NgunnawalQuizPage.this, ResultsPage.class);
        int finalScore = 0;
        if ((score) >= quiz.getQuestions().size()) {
            intent.putExtra(ResultsPage.INTENT_MESSAGE2, String.valueOf((GAME_TIME / ONE_SECOND) - timerCount));
            finalScore = (score * 5) + (GAME_TIME / ONE_SECOND) - timerCount;
        } else {
            intent.putExtra(ResultsPage.INTENT_MESSAGE2, String.valueOf(0));
            finalScore = (score * 5);
        }
        intent.putExtra(ResultsPage.INTENT_MESSAGE1, String.valueOf(score));
        intent.putExtra(ResultsPage.INTENT_MESSAGE3, String.valueOf(finalScore));
        intent.putExtra(ResultsPage.INTENT_MESSAGE4, language);
        NgunnawalQuiz.resetQuiz();
        timer.cancel();
        startActivity(intent);
    }
}