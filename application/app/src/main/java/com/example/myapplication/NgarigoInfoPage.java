package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NgarigoInfoPage extends AppCompatActivity {
    Button dictionary, photoEssay, riverConnection, champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngarigo_info_page);

        dictionary = findViewById(R.id.btNgarigoDictionary);
        dictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchDictionary();
            }
        });

        photoEssay = findViewById(R.id.btNgarigoLink1);
        photoEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchPhotoEssay();
            }
        });

        riverConnection = findViewById(R.id.btNgarigoLink2);
        riverConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRiverConnection();
            }
        });

        champion = findViewById(R.id.btNgarigoLink3);
        champion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchChampion();
            }
        });
    }

    private void launchDictionary() {
        Intent intent = new Intent(NgarigoInfoPage.this, NgarigoDictionaryPage.class);
        startActivity(intent);
    }

    private void launchPhotoEssay() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theguardian.com/australia-news/2019/apr/14/ngarigo-australias-people-of-the-snow-a-photo-essay"));
        startActivity(intent);
    }

    private void launchRiverConnection() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://riversofcarbon.org.au/ngarigo-river-connections/"));
        startActivity(intent);
    }

    private void launchChampion() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nit.com.au/ash-barty-proving-that-dreams-can-come-true/"));
        startActivity(intent);
    }
}