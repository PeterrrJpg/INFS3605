package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NgunnawalInfoPage extends AppCompatActivity {
    private Button dictionary, link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngunnawal_info_page);

        dictionary = findViewById(R.id.btNgunnawalDictionary);
        dictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDictionary();
            }
        });

        link1 = findViewById(R.id.btNgunnawalLink1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchHeritage();
            }
        });
    }

    private void launchDictionary() {
        Intent intent = new Intent(NgunnawalInfoPage.this, NgunnawalDictionaryPage.class);
        startActivity(intent);
    }

    private void launchHeritage() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tidbinbilla.act.gov.au/learn/ngunnawal-culture-and-heritage"));
        startActivity(intent);
    }
}