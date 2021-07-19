package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ChooseLanguagePage extends AppCompatActivity {
    private EditText etNewLan;
    private Spinner sExstingLan;
    private String existingLan[];
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language_page);

        existingLan = new String[]{"Ngunnawal", "Ngarigo"};

        etNewLan = findViewById(R.id.etNewLanguage);

        sExstingLan = findViewById(R.id.sExistingLan);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, existingLan);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sExstingLan.setAdapter(mAdapter);

        btNext = findViewById(R.id.btNext);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luanchChooseWordPage();
            }
        });
    }

    private void luanchChooseWordPage() {
        if (etNewLan.getText().toString().equals("") || etNewLan.getText().toString().isEmpty()) {
            Intent intent = new Intent(ChooseLanguagePage.this, ChooseWordPage.class);
            intent.putExtra(ChooseWordPage.INTENT_MESSAGE, sExstingLan.getSelectedItem().toString());
            startActivity(intent);
        } else {
            Intent intent = new Intent(ChooseLanguagePage.this, ChooseWordPage.class);
            intent.putExtra(ChooseWordPage.INTENT_MESSAGE, etNewLan.getText().toString());
            startActivity(intent);
        }
    }
}