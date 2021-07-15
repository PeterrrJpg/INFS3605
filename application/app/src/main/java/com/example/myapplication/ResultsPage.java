package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ResultsPage extends AppCompatActivity {
    public static final String INTENT_MESSAGE1 = "ResultsPageScore";
    public static final String INTENT_MESSAGE2 = "ResultsPageBonus";
    public static final String INTENT_MESSAGE3 = "ResultsPageFinalScore";

    private int prevHighscore;

    private FirebaseUser mUser;
    private DatabaseReference mDatabase;

    private TextView tvScore;
    private TextView tvBonusScore;
    private TextView tvFinalScore;
    private TextView tvHigh;
    private TextView tvHighscore;
    private Button btPlayAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        Intent intent = getIntent();
        String score = intent.getStringExtra(INTENT_MESSAGE1);
        String bonusTime = intent.getStringExtra(INTENT_MESSAGE2);
        String finalScore = intent.getStringExtra(INTENT_MESSAGE3);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mUser = FirebaseAuth.getInstance().getCurrentUser();

        tvScore = findViewById(R.id.tvScore);
        tvBonusScore = findViewById(R.id.tvBonusScore);
        tvFinalScore = findViewById(R.id.tvFinalScore);
        tvHigh = findViewById(R.id.tvHigh);
        tvHighscore = findViewById(R.id.tvHighscore);
        btPlayAgain = findViewById(R.id.btPlayAgain);

        mDatabase.child("Users").child(mUser.getUid()).child("highscore")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        prevHighscore = Integer.parseInt(snapshot.getValue().toString());

                        if (prevHighscore >= Integer.parseInt(finalScore)) {
                            tvHighscore.setText(String.valueOf(prevHighscore));
                        } else {
                            tvHigh.setText("New Highscore");
                            tvHighscore.setText(finalScore);
                            mDatabase.child("Users").child(mUser.getUid()).child("highscore").setValue(finalScore);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        tvScore.setText(score);
        tvBonusScore.setText(bonusTime);
        tvFinalScore.setText(finalScore);

        btPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchQuizPage();
            }
        });
    }

    private void launchMainPage() {
        Intent intent = new Intent(this, MainPage.class);
        startActivity(intent);
    }

    private void launchQuizPage() {
        Intent intent = new Intent(this, QuizPage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        launchMainPage();
    }
}