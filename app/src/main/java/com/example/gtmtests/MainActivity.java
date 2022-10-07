package com.example.gtmtests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        findViewById(R.id.button_1).setOnClickListener(view -> {
            Bundle params = new Bundle();
            params.putString("image_name", "name");
            params.putString("full_text", "text");
            mFirebaseAnalytics.logEvent("share_image", params);
        });

        findViewById(R.id.button_2).setOnClickListener(view -> {

        });

        findViewById(R.id.button_3).setOnClickListener(view -> {

        });
    }
}