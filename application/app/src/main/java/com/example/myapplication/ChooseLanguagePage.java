package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLanguagePage extends AppCompatActivity {
    private Button btNgunnawal;
    private Button btNgarigo;

    public static final String CHOOSE_INTENT = "choose language";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language_page);

        Intent intent = getIntent();
        String category = intent.getStringExtra(CHOOSE_INTENT);

        btNgunnawal = findViewById(R.id.btNgunnawal);
        btNgunnawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (category.equals("People")) {
                    launchNgunnawalPeoplePage();
                } else if (category.equals("Human Body")) {
                    launchNgunnawalHBPage();
                }
            }
        });

        btNgarigo = findViewById(R.id.btNgarigo);
        btNgarigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (category.equals("People")) {
                    launchNgarigoPeoplePage();
                } else if (category.equals("Human Body")) {
                    launchNgarigoHBPage();
                }
            }
        });
    }

    private void launchNgunnawalPeoplePage() {
        Intent intent = new Intent(ChooseLanguagePage.this, NgunnawalPeoplePage.class);
        startActivity(intent);
    }

    private void launchNgarigoPeoplePage() {
        Intent intent = new Intent(ChooseLanguagePage.this, NgarigoPeoplePage.class);
        startActivity(intent);
    }

    private void launchNgunnawalHBPage() {
        Intent intent = new Intent(ChooseLanguagePage.this, NgunnawalHBPage.class);
        startActivity(intent);
    }

    private void launchNgarigoHBPage() {
        Intent intent = new Intent(ChooseLanguagePage.this, NgarigoHBPage.class);
        startActivity(intent);
    }
}