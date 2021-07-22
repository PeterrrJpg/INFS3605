package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Date;

public class ChooseWordPage extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "language";
    private EditText eng, fnp;
    private Button request;

    private FirebaseUser mUser;
    private DatabaseReference mDatabase;
    private DatabaseReference mUsername;

    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_word_page);

        Intent intent = getIntent();
        String language = intent.getStringExtra(INTENT_MESSAGE).toLowerCase();

        eng = findViewById(R.id.etEngWord);
        fnp = findViewById(R.id.etFirstNationWord);


        mDatabase = FirebaseDatabase.getInstance().getReference();
        mUser = FirebaseAuth.getInstance().getCurrentUser();

        mUsername = FirebaseDatabase.getInstance().getReference("Users").child(mUser.getUid()).child("name");
        mUsername.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                username = snapshot.getValue().toString();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        request = findViewById(R.id.btRequest);

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eng.getText().toString().matches("")) {
                    Toast.makeText(ChooseWordPage.this, "English word cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (fnp.getText().toString().matches("")) {
                    Toast.makeText(ChooseWordPage.this, "First Nations People word cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    makeRequest(username, language, eng.getText().toString().toLowerCase(), fnp.getText().toString().toLowerCase());
                }
            }
        });
    }

    private void makeRequest(String username, String lan, String engWord, String fnpWord) {
        String currentTime = Calendar.getInstance().getTime().toString();
        mDatabase.child("Requests").child(username).child(currentTime).child("language").setValue(lan);
        mDatabase.child("Requests").child(username).child(currentTime).child("eng_word").setValue(engWord);
        mDatabase.child("Requests").child(username).child(currentTime).child("fnp_word").setValue(fnpWord);
        launchHomePage();
    }

    private void launchHomePage() {
        Toast.makeText(ChooseWordPage.this, "Success!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}