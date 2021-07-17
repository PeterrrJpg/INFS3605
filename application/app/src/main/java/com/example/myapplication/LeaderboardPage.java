package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;

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

    // Ngunnawal
    private RecyclerView mRecyclerview;
    private LeaderboardAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static ArrayList<Leaderboard> leaderboard;

    // Ngarigo
    private RecyclerView mRecyclerview2;
    private LeaderboardAdapter mAdapter2;
    private RecyclerView.LayoutManager layoutManager2;

    public static ArrayList<Leaderboard> leaderboard2;

    // ALL language
    private RecyclerView mRecyclerview3;
    private LeaderboardAdapter mAdapter3;
    private RecyclerView.LayoutManager layoutManager3;

    public static ArrayList<Leaderboard> leaderboard3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard_page);

        mUser = FirebaseAuth.getInstance().getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        // Ngunnawal
        leaderboard = new ArrayList<>();

        mRecyclerview = findViewById(R.id.rvLeaderboardNgunnawal);
        mRecyclerview.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(layoutManager);

        mAdapter = new LeaderboardAdapter(new ArrayList<>());
        mRecyclerview.setAdapter(mAdapter);

        setLeaderboardNgunnawal();

        // Ngarigo
        leaderboard2 = new ArrayList<>();

        mRecyclerview2 = findViewById(R.id.rvLeaderboardNgarigo);
        mRecyclerview2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this);
        mRecyclerview2.setLayoutManager(layoutManager2);

        mAdapter2 = new LeaderboardAdapter(new ArrayList<>());
        mRecyclerview2.setAdapter(mAdapter2);

        setLeaderboardNgarigo();

        // ALL
        leaderboard3 = new ArrayList<>();

        mRecyclerview3 = findViewById(R.id.rvLeaderboardAll);
        mRecyclerview3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(this);
        mRecyclerview3.setLayoutManager(layoutManager3);

        mAdapter3 = new LeaderboardAdapter(new ArrayList<>());
        mRecyclerview3.setAdapter(mAdapter3);

        setLeaderboardALL();

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

    private void setLeaderboardNgunnawal() {
        mDatabase.child("Users")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot data : snapshot.getChildren()) {
                            String name = ((HashMap) data.getValue()).get("name").toString();
                            int score = Integer.parseInt(((HashMap) data.getValue()).get("ngunnawal_highscore").toString());
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

    private void setLeaderboardNgarigo() {
        mDatabase.child("Users")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot data : snapshot.getChildren()) {
                            String name = ((HashMap) data.getValue()).get("name").toString();
                            int score = Integer.parseInt(((HashMap) data.getValue()).get("ngarigo_highscore").toString());
                            String profile = ((HashMap) data.getValue()).get("profile").toString();
                            Leaderboard user = new Leaderboard(name, score, profile);
                            leaderboard2.add(user);
                        }
                        Collections.sort((List) leaderboard2, new Comparator<Leaderboard>() {
                            @Override
                            public int compare(Leaderboard o1, Leaderboard o2) {
                                if (o2.getHighscore().compareTo(o1.getHighscore()) == 0) {
                                    return -1;
                                }
                                return o2.getHighscore().compareTo(o1.getHighscore());
                            }
                        });
                        mAdapter2.setData(leaderboard2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
    }

    private void setLeaderboardALL() {
        mDatabase.child("Users")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot data : snapshot.getChildren()) {
                            String name = ((HashMap) data.getValue()).get("name").toString();
                            int score = Integer.parseInt(((HashMap) data.getValue()).get("all_highscore").toString());
                            String profile = ((HashMap) data.getValue()).get("profile").toString();
                            Leaderboard user = new Leaderboard(name, score, profile);
                            leaderboard3.add(user);
                        }
                        Collections.sort((List) leaderboard2, new Comparator<Leaderboard>() {
                            @Override
                            public int compare(Leaderboard o1, Leaderboard o2) {
                                if (o2.getHighscore().compareTo(o1.getHighscore()) == 0) {
                                    return -1;
                                }
                                return o2.getHighscore().compareTo(o1.getHighscore());
                            }
                        });
                        mAdapter3.setData(leaderboard3);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
    }
}