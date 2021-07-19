package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
    private TextView test1, test2;

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

        test1 = findViewById(R.id.tvTest1);
        test2 = findViewById(R.id.tvTest2);
    }

    private void luanchChooseWordPage() {
        if (etNewLan.getText().toString().equals("") || etNewLan.getText().toString().isEmpty()) {
            test1.setText("empty");
        } else {
            test1.setText(etNewLan.getText().toString());
        }
        test2.setText(sExstingLan.getSelectedItem().toString());
    }
}