package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddNewLanWordPage extends AppCompatActivity {
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_lan_word_page);

        btNext = findViewById(R.id.btAddLan);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchChooseLanPage();
            }
        });
    }

    private void launchChooseLanPage() {
        Intent intent = new Intent(AddNewLanWordPage.this, ChooseLanguagePage.class);
        startActivity(intent);
    }
}