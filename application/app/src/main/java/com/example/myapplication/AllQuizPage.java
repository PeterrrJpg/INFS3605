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

public class AllQuizPage extends AppCompatActivity {
    private AllQuiz quiz;
    private int score;
    private CountDownTimer timer;
    private int timerCount;
    private int currentQuestion;
    private int displayCurrentQuestion;
    private int numQuestionsRight;
    private final int ONE_SECOND = 1000;
    private final int GAME_TIME = 30000;
    private final int NUM_QUESTION = 3;

    private TextView tvQuestion;
    private TextView tvTimer;
    private TextView tvScore;
    private TextView tvNumQuestion;
    private Button btOption1;
    private Button btOption2;
    private Button btOption3;
    private Button btOption4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_quiz_page);

        tvQuestion = findViewById(R.id.tvQuestionAll);
        tvTimer = findViewById(R.id.tvTimerAll);
        tvScore = findViewById(R.id.tvScoreAllQuiz);
        tvNumQuestion = findViewById(R.id.tvQuestionAllQuiz);
        btOption1 = findViewById(R.id.btOption1All);
        btOption2 = findViewById(R.id.btOption2All);
        btOption3 = findViewById(R.id.btOption3All);
        btOption4 = findViewById(R.id.btOption4All);

        displayCurrentQuestion = 1;
        tvNumQuestion.setText("Question: " + displayCurrentQuestion + "/" + NUM_QUESTION);
        numQuestionsRight = 0;
        tvScore.setText("Score: " + numQuestionsRight * 5);

        quiz = AllQuiz.getInstance();
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
        Toast.makeText(AllQuizPage.this, "You ran out of time!", Toast.LENGTH_SHORT).show();
        AllQuiz.resetQuiz();
        timer.cancel();
        Intent intent = new Intent(AllQuizPage.this, HomePage.class);
        startActivity(intent);
    }

    private void quitQuiz() {
        Toast.makeText(AllQuizPage.this, "Quiz Aborted", Toast.LENGTH_SHORT).show();
        AllQuiz.resetQuiz();
        timer.cancel();
        Intent intent = new Intent(AllQuizPage.this, HomePage.class);
        startActivity(intent);
    }

    private void submitAnswer(int option) {
        if (quiz.getQuestions().get(currentQuestion).getOptions().get(option).second == true) {
            score++;
            if (quiz.getQuestions().size() - (currentQuestion + 1) > 0) {
                currentQuestion++;
                displayCurrentQuestion++;
                tvNumQuestion.setText("Question: " + displayCurrentQuestion + "/" + NUM_QUESTION);
                numQuestionsRight++;
                tvScore.setText("Score: " + numQuestionsRight * 5);
                loadNextQuestion();
                Toast.makeText(AllQuizPage.this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                timer.cancel();
                launchResultsPage("all");
            }
        } else {
            if (quiz.getQuestions().size() - (currentQuestion + 1) > 0) {
                currentQuestion++;
                displayCurrentQuestion++;
                tvNumQuestion.setText("Question: " + displayCurrentQuestion + "/" + NUM_QUESTION);
                loadNextQuestion();
                Toast.makeText(AllQuizPage.this, "Incorrect", Toast.LENGTH_SHORT).show();
            } else {
                timer.cancel();
                launchResultsPage("all");
            }
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
        Intent intent = new Intent(AllQuizPage.this, ResultsPage.class);
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
        AllQuiz.resetQuiz();
        timer.cancel();
        startActivity(intent);
    }
}