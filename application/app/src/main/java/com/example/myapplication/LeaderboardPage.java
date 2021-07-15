package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class LeaderboardPage extends AppCompatActivity {
    private FirebaseUser mUser;
    private DatabaseReference mDatabase;

    private RecyclerView mRecyclerview;
    private LeaderboardAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static ArrayList<Leaderboard> leaderboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard_page);

        mUser = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        leaderboard = new ArrayList<>();

        mRecyclerview = findViewById(R.id.rvLeaderboard);
        mRecyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(layoutManager);

        mAdapter = new LeaderboardAdapter(new ArrayList<>());
        mRecyclerview.setAdapter(mAdapter);

        setLeaderboard();

        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Loading Leaderboard");
        progress.setMessage("Please wait while leaderboard is being loaded");
        progress.show();
        Runnable progressRunnable = new Runnable() {

            @Override
            public void run() {
                progress.cancel();
            }
        };
        Handler pdCanceller = new Handler();
        pdCanceller.postDelayed(progressRunnable, 3550);
    }

    private void setLeaderboard() {
        mDatabase.child("Users")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot data : snapshot.getChildren()) {
                            String name = ((HashMap) data.getValue()).get("name").toString();
                            int score = Integer.parseInt(((HashMap) data.getValue()).get("highscore").toString());
                            String profile = ((HashMap) data.getValue()).get("profile").toString();
                            Leaderboard user = new Leaderboard(name, score, profile);
                            leaderboard.add(user);
                        }
                        Collections.sort((List) leaderboard, new Comparator<Leaderboard>() {
                            @Override
                            public int compare(Leaderboard o1, Leaderboard o2) {
                                if (o2.getHighscore().compareTo(o1.getHighscore()) == 0) {
                                    return -1;
                                }
                                return o2.getHighscore().compareTo(o1.getHighscore());
                            }
                        });
                        mAdapter.setData(leaderboard);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
    }
}